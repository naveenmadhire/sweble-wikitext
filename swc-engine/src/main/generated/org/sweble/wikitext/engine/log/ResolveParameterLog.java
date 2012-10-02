/* 
 * This file is auto-generated.
 * DO NOT MODIFY MANUALLY!
 * 
 * Generated by AstNodeGenerator.
 * Last generated: 2012-10-02 10:53:34.
 */

package org.sweble.wikitext.engine.log;

import org.sweble.wikitext.parser.nodes.WtContentNode;

import de.fau.cs.osr.ptk.common.ast.AstNodePropertyIterator;




/**
 * <h1>Resolve Parameter Log</h1>
 */
public class ResolveParameterLog
        extends WtContentNode
        
{
	private static final long serialVersionUID = 1L;

	// =========================================================================

	public ResolveParameterLog()
	{
		super();

	}
	public ResolveParameterLog(String name, boolean success)
	{
		super();
		setName(name);
		setSuccess(success);

	}




	// =========================================================================
	// Properties

	private boolean success;

	public final boolean getSuccess()
	{
		return this.success;
	}
	
	public final boolean setSuccess(boolean success)
	{
		boolean old = this.success;
		this.success = success;
		return old;
	}
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
	private Long timeNeeded;

	public final Long getTimeNeeded()
	{
		return this.timeNeeded;
	}
	
	public final Long setTimeNeeded(Long timeNeeded)
	{
		Long old = this.timeNeeded;
		this.timeNeeded = timeNeeded;
		return old;
	}

	@Override
	public final int getPropertyCount()
	{
		return 3;
	}
	
	@Override
	public final AstNodePropertyIterator propertyIterator()
	{
		return new AstNodePropertyIterator()
		{
			@Override
			protected int getPropertyCount()
			{
				return 3;
			}
			
			@Override
			protected String getName(int index)
			{
				switch (index)
				{
					case 0:
						return "success";
					case 1:
						return "name";
					case 2:
						return "timeNeeded";

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
						return ResolveParameterLog.this.getSuccess();
					case 1:
						return ResolveParameterLog.this.getName();
					case 2:
						return ResolveParameterLog.this.getTimeNeeded();

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
						return ResolveParameterLog.this.setSuccess((Boolean) value);
					case 1:
						return ResolveParameterLog.this.setName((String) value);
					case 2:
						return ResolveParameterLog.this.setTimeNeeded((Long) value);

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
