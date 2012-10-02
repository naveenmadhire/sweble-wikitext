package org.sweble.wikitext.parser.nodes;

/**
 * <h1>Link Option: LinkTarget</h1> <h2>Grammar</h2>
 * <ul>
 * <li>
 * <p>
 * LinkOptionLinkTarget ::= Ws* 'link=' LinkTarget Ws*
 * </p>
 * </li>
 * <li>
 * <p>
 * LinkOptionLinkTarget ::= Ws* 'link=' Url Ws*
 * </p>
 * </li>
 * </ul>
 */
public class LinkOptionLinkTarget
		extends
			WtInnerNode1
{
	private static final long serialVersionUID = 1L;
	
	// =========================================================================
	
	public LinkOptionLinkTarget()
	{
		super((WikitextNode) null);
		
	}
	
	public LinkOptionLinkTarget(WikitextNode target)
	{
		super(target);
		
	}
	
	@Override
	public int getNodeType()
	{
		return org.sweble.wikitext.parser.AstNodeTypes.NT_LINK_OPTION_LINK_TARGET;
	}
	
	// =========================================================================
	// Children
	
	public final void setTarget(WikitextNode target)
	{
		set(0, target);
	}
	
	public final WikitextNode getTarget()
	{
		return (WikitextNode) get(0);
	}
	
	private static final String[] CHILD_NAMES = new String[] { "target" };
	
	public final String[] getChildNames()
	{
		return CHILD_NAMES;
	}
}
