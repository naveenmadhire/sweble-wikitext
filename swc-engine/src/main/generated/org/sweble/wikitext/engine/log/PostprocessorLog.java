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
 * <h1>Postprocessor Log</h1>
 */
public class PostprocessorLog
        extends WtContentNode
        
{
	private static final long serialVersionUID = 1L;

	// =========================================================================

	public PostprocessorLog()
	{
		super();

	}




	// =========================================================================
	// Properties

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
						return PostprocessorLog.this.getTimeNeeded();

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
						return PostprocessorLog.this.setTimeNeeded((Long) value);

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
