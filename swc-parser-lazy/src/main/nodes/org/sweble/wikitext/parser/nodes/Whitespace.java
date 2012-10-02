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
 * <h1>Whitespace</h1>
 */
public class Whitespace
		extends
			WtContentNode

{
	private static final long serialVersionUID = 1L;
	
	// =========================================================================
	
	public Whitespace()
	{
		super();
		
	}
	
	public Whitespace(WtList content, boolean hasNewline)
	{
		super(content);
		setHasNewline(hasNewline);
		
	}
	
	@Override
	public int getNodeType()
	{
		return org.sweble.wikitext.parser.AstNodeTypes.NT_WHITESPACE;
	}
	
	// =========================================================================
	// Properties
	
	private boolean hasNewline;
	
	public final boolean getHasNewline()
	{
		return this.hasNewline;
	}
	
	public final boolean setHasNewline(boolean hasNewline)
	{
		boolean old = this.hasNewline;
		this.hasNewline = hasNewline;
		return old;
	}
	
	@Override
	public final int getPropertyCount()
	{
		return 1;
	}
	
	@Override
	public final AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected int getPropertyCount()
			{
				return 1;
			}
			
			@Override
			protected String getName(int index)
			{
				switch (index)
				{
					case 0:
						return "hasNewline";
						
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
						return Whitespace.this.getHasNewline();
						
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
						return Whitespace.this.setHasNewline((Boolean) value);
						
					default:
						throw new IndexOutOfBoundsException();
				}
			}
		};
	}
	
	// =========================================================================
	// Children
	
	// =========================================================================
	
}
