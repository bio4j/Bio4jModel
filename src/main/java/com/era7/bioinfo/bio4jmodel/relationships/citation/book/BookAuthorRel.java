/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.era7.bioinfo.bio4jmodel.relationships.citation.book;

import com.era7.bioinfo.bioinfoneo4j.BasicRelationship;
import org.neo4j.graphdb.Relationship;

/**
 * Book authors
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class BookAuthorRel extends BasicRelationship{

    public static final String NAME = "BOOK_AUTHOR";

    public BookAuthorRel(Relationship rel){
        super(rel);
    }

    @Override
    public String name() {
        return NAME;
    }

}
