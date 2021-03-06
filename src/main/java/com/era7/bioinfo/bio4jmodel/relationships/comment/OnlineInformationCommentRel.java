/*
 * Copyright (C) 2010-2011  "Bio4j"
 *
 * This file is part of Bio4j
 *
 * Bio4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.era7.bioinfo.bio4jmodel.relationships.comment;

import org.neo4j.graphdb.Relationship;

/**
 *
 * @author ppareja
 */
public class OnlineInformationCommentRel extends BasicCommentRel{

    public static final String RELATIONSHIP_NAME = "COMMENT_ONLINE_INFORMATION";

    public static final String UNIPROT_ATTRIBUTE_TYPE_VALUE = "online information";

    public static final String NAME_PROPERTY = "name";
    public static final String LINK_PROPERTY = "link";

    public OnlineInformationCommentRel(Relationship rel){
        super(rel);
    }

    public String getName(){
        return String.valueOf(this.relationship.getProperty(NAME_PROPERTY));
    }
    public String getLink(){
        return String.valueOf(this.relationship.getProperty(LINK_PROPERTY));
    }

    public void setName(String value){
        this.relationship.setProperty(NAME_PROPERTY, value);
    }
    public void setLink(String value){
        this.relationship.setProperty(LINK_PROPERTY, value);
    }


    @Override
    public String name() {
        return RELATIONSHIP_NAME;
    }

    @Override
    public String toString(){
        return super.toString();
    }

}

