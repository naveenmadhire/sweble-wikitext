/* 
 * This file is auto-generated.
 * DO NOT MODIFY MANUALLY!
 * 
 * Generated by AstNodeGenerator.
 * Last generated: 2012-09-26 11:07:49.
 */

package org.sweble.wikitext.parser.nodes;

import de.fau.cs.osr.ptk.common.ast.AstNodePropertyIterator;

/**
 * <h1>TagExtension</h1> <h2>Grammar</h2>
 */
public class TagExtension
		extends
			WtInnerNode1

{
	private static final long serialVersionUID = 1L;
	
	// =========================================================================
	
	public TagExtension()
	{
		super(new WtList());
		
	}
	
	public TagExtension(String name, WtList xmlAttributes, String body)
	{
		super(xmlAttributes);
		setName(name);
		setBody(body);
		
	}
	
	@Override
	public int getNodeType()
	{
		return org.sweble.wikitext.parser.AstNodeTypes.NT_TAG_EXTENSION;
	}
	
	// =========================================================================
	// Properties
	
	private String name;
	
	public final String getName()
	{
		return this.name;
	}
	
	public final String setName(String name)
	{
		String old = this.name;
		this.name = name;
		return old;
	}
	
	private String body;
	
	public final String getBody()
	{
		return this.body;
	}
	
	public final String setBody(String body)
	{
		String old = this.body;
		this.body = body;
		return old;
	}
	
	@Override
	public final int getPropertyCount()
	{
		return 2;
	}
	
	@Override
	public final AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected int getPropertyCount()
			{
				return 2;
			}
			
			@Override
			protected String getName(int index)
			{
				switch (index)
				{
					case 0:
						return "name";
					case 1:
						return "body";
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
			
			@Override
			protected Object getValue(int index)
			{
				switch (index)
				{
					case 0:
						return TagExtension.this.getName();
					case 1:
						return TagExtension.this.getBody();
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
			
			@Override
			protected Object setValue(int index, Object value)
			{
				switch (index)
				{
					case 0:
						return TagExtension.this.setName((String) value);
					case 1:
						return TagExtension.this.setBody((String) value);
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
		};
	}
	
	// =========================================================================
	// Children
	
	public final void setXmlAttributes(WtList xmlAttributes)
	{
		set(0, xmlAttributes);
	}
	
	public final WtList getXmlAttributes()
	{
		return (WtList) get(0);
	}
	
	private static final String[] CHILD_NAMES = new String[] { "xmlAttributes" };
	
	public final String[] getChildNames()
	{
		return CHILD_NAMES;
	}
	
	// =========================================================================
	
}
