package com.github.czyzby.lml.parser.impl.attribute.table.cell;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Cell;
import com.badlogic.gdx.scenes.scene2d.ui.Value;
import com.github.czyzby.lml.parser.LmlParser;
import com.github.czyzby.lml.parser.tag.LmlTag;
import com.github.czyzby.lml.util.LmlUtilities;

/** See {@link Cell#spaceRight(Value)}. See {@link LmlUtilities#parseHorizontalValue(LmlParser, LmlTag, Actor, String)}
 * and {@link LmlUtilities#parseVerticalValue(LmlParser, LmlTag, Actor, String)} for more info on value parsing. Mapped
 * to "spaceRight".
 *
 * @author MJ */
public class CellSpaceRightLmlAttribute extends AbstractCellLmlAttribute {
    @Override
    public void process(final LmlParser parser, final LmlTag tag, final Actor actor, final Cell<?> cell,
            final String rawAttributeData) {
        final Value horizontalValue = LmlUtilities.parseHorizontalValue(parser, tag.getParent(), actor,
                rawAttributeData);
        cell.spaceRight(horizontalValue);
    }
}
