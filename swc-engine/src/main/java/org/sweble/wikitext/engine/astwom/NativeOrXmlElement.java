/**
 * Copyright 2011 The Open Source Research Group,
 *                University of Erlangen-Nürnberg
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sweble.wikitext.engine.astwom;

import org.sweble.wikitext.engine.wom.WomNodeType;
import org.sweble.wikitext.parser.AstNodeTypes;
import org.sweble.wikitext.parser.nodes.WikitextNode;
import org.sweble.wikitext.parser.nodes.WtList;
import org.sweble.wikitext.parser.nodes.XmlElement;

public abstract class NativeOrXmlElement
		extends
			FullElement
{
	private static final long serialVersionUID = 1L;
	
	// =========================================================================
	
	public NativeOrXmlElement(WikitextNode astNode)
	{
		super(astNode);
		
		if (astNode == null)
			throw new NullPointerException();
	}
	
	public NativeOrXmlElement(String tagName, XmlElement astNode)
	{
		super(astNode);
		
		if (astNode == null)
			throw new NullPointerException();
		
		if (!astNode.getName().equalsIgnoreCase(tagName))
			throw new IllegalArgumentException("Given XmlElement node is not a `" + tagName + "' element!");
	}
	
	// =========================================================================
	
	@Override
	public final WomNodeType getNodeType()
	{
		return WomNodeType.ELEMENT;
	}
	
	// =========================================================================
	
	protected abstract XmlElement convertToXmlElement();
	
	// =========================================================================
	
	@Override
	protected final WtList getAstAttribContainer()
	{
		if (isXml())
			return xml().getXmlAttributes();
		
		return null;
	}
	
	@Override
	protected final WtList addAstAttribSupport() throws UnsupportedOperationException
	{
		convertToXml();
		return xml().getXmlAttributes();
	}
	
	// =========================================================================
	
	@Override
	public WtList getAstChildContainer()
	{
		if (isXml())
			return xml().getBody();
		
		return null;
	}
	
	@Override
	protected final WtList addAstChildrenSupport() throws UnsupportedOperationException
	{
		convertToXml();
		return xml().getBody();
	}
	
	@Override
	protected void appendToAst(WtList container, WikitextNode child)
	{
		if (isXml())
		{
			if (container.isEmpty())
			{
				XmlElement e = xml();
				e.setEmpty(false);
				Toolbox.addRtData(e);
			}
		}
		
		super.appendToAst(container, child);
	}
	
	@Override
	protected void removeFromAst(WtList container, WikitextNode removeNode)
	{
		super.removeFromAst(container, removeNode);
		
		if (isXml())
		{
			if (container.isEmpty())
			{
				XmlElement e = xml();
				e.setEmpty(true);
				Toolbox.addRtData(e);
			}
		}
	}
	
	// =========================================================================
	
	protected final boolean isXml()
	{
		return getAstNode().getNodeType() == AstNodeTypes.NT_XML_ELEMENT;
	}
	
	protected final XmlElement xml()
	{
		return (XmlElement) getAstNode();
	}
	
	protected final void convertToXml()
	{
		if (!isXml())
		{
			XmlElement converted = convertToXmlElement();
			
			WomBackbone parent = getParent();
			if (parent != null)
			{
				WtList astChildContainer = null;
				if (parent instanceof FullElement)
					astChildContainer = ((FullElement) parent).getAstChildContainer();
				
				Toolbox.replaceAstNode(astChildContainer, getAstNode(), converted);
			}
			
			setAstNode(converted);
		}
	}
}
