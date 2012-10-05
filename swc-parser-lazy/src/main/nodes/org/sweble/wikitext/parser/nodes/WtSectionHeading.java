package org.sweble.wikitext.parser.nodes;

/**
 * <h1>WtSection WtSectionHeading</h1> <h2>Grammar</h2>
 * <ul>
 * <li>
 * <p>
 * '='+ Title '='+ Space* EolOrEof
 * </p>
 * </li>
 * </ul>
 * <h2>The title can contain</h2>
 * <ul>
 * <li>
 * <p>
 * WtExternalLink
 * </p>
 * </li>
 * <li>
 * <p>
 * WtInternalLink
 * </p>
 * </li>
 * <li>
 * <p>
 * WtPageSwitch
 * </p>
 * </li>
 * <li>
 * <p>
 * WtParserEntity
 * </p>
 * </li>
 * <li>
 * <p>
 * PlainExternalLink
 * </p>
 * </li>
 * <li>
 * <p>
 * WtSignature
 * </p>
 * </li>
 * <li>
 * <p>
 * WtTicks
 * </p>
 * </li>
 * <li>
 * <p>
 * WtXmlElement
 * </p>
 * </li>
 * <li>
 * <p>
 * XmlReference
 * </p>
 * </li>
 * </ul>
 * <h2>The title cannot contain</h2>
 * <ul>
 * <li>
 * <p>
 * Newline
 * </p>
 * <ul>
 * <li>
 * <p>
 * Tables
 * </p>
 * </li>
 * <li>
 * <p>
 * Headings
 * </p>
 * </li>
 * <li>
 * <p>
 * Horizontal lines
 * </p>
 * </li>
 * <li>
 * <p>
 * Block level elements
 * </p>
 * </li>
 * </ul>
 * </li>
 * </ul>
 * <h2>The title can not contain (syntactically)</h2>
 * <ul>
 * <li>
 * <p>
 * Newlines
 * </p>
 * </li>
 * </ul>
 */
public class WtSectionHeading
		extends
			WtContentNodeMarkTwo
{
	private static final long serialVersionUID = 1L;
	
	// =========================================================================
	
	public WtSectionHeading()
	{
		super();
	}
	
	public WtSectionHeading(WtNodeList content)
	{
		super(content);
	}
	
	@Override
	public int getNodeType()
	{
		return NT_SECTION_HEADING;
	}
}
