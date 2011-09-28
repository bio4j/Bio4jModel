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
package com.era7.bioinfo.bio4jmodel.nodes;

import com.era7.bioinfo.bio4jmodel.nodes.citation.ArticleNode;
import com.era7.bioinfo.bio4jmodel.nodes.citation.BookNode;
import com.era7.bioinfo.bio4jmodel.nodes.citation.OnlineArticleNode;
import com.era7.bioinfo.bio4jmodel.nodes.citation.PatentNode;
import com.era7.bioinfo.bio4jmodel.nodes.citation.SubmissionNode;
import com.era7.bioinfo.bio4jmodel.nodes.citation.ThesisNode;
import com.era7.bioinfo.bio4jmodel.nodes.citation.UnpublishedObservationNode;
import com.era7.bioinfo.bio4jmodel.nodes.refseq.GenomeElementNode;
import com.era7.bioinfo.bio4jmodel.relationships.citation.article.ArticleProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.book.BookProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.onarticle.OnlineArticleProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.patent.PatentProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.submission.SubmissionProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.thesis.ThesisProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.citation.uo.UnpublishedObservationProteinCitationRel;
import com.era7.bioinfo.bio4jmodel.relationships.comment.DomainCommentRel;
import com.era7.bioinfo.bio4jmodel.relationships.comment.FunctionCommentRel;
import com.era7.bioinfo.bio4jmodel.relationships.comment.PathwayCommentRel;
import com.era7.bioinfo.bio4jmodel.relationships.comment.SimilarityCommentRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinDatasetRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinGenomeElementRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinGoRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinInterproRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinIsoformInteractionRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinKeywordRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinOrganismRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinProteinInteractionRel;
import com.era7.bioinfo.bio4jmodel.relationships.protein.ProteinSubcellularLocationRel;
import com.era7.bioinfo.bioinfoneo4j.BasicEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.neo4j.graphdb.Direction;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Relationship;

/**
 * Uniprot proteins
 * @author Pablo Pareja Tobes <ppareja@era7.com>
 */
public class ProteinNode extends BasicEntity {

    public static final String PROTEIN_ACCESSION_INDEX = "protein_accession_index";
    public static final String PROTEIN_FULL_NAME_FULL_TEXT_INDEX = "protein_full_name_full_text_index";
    public static final String PROTEIN_GENE_NAMES_FULL_TEXT_INDEX = "protein_gene_names_full_text_index";

    public static final String NODE_TYPE = ProteinNode.class.getCanonicalName();
    
    public static final String NAME_PROPERTY = "name";
    public static final String FULL_NAME_PROPERTY = "full_name";
    public static final String SHORT_NAME_PROPERTY = "short_name";
    public static final String ACCESSION_PROPERTY = "accession";
    public static final String SEQUENCE_PROPERTY = "sequence";
    public static final String MASS_PROPERTY = "mass";
    public static final String LENGTH_PROPERTY = "length";
    public static final String MODIFIED_DATE_PROPERTY = "modified_date";
    public static final String GENE_NAMES_PROPERTY = "gene_names";
    public static final String ENSEMBL_ID_PROPERTY = "ensembl_id";
    public static final String PIR_ID_PROPERTY = "pir_id";
    public static final String KEGG_ID_PROPERTY = "kegg_id";
    public static final String EMBL_REFERENCES_PROPERTY = "embl_references";
    public static final String REFSEQ_REFERENCES_PROPERTY = "refseq_references";
    public static final String ARRAY_EXPRESS_ID_PROPERTY = "array_express_id";
    public static final String UNIGENE_ID_PROPERTY = "unigene_id";
    public static final String ALTERNATIVE_ACCESSIONS_PROPERTY = "alternative_accessions";

    //public static final String GENE_NAMES_SEPARATOR = "\t";

    public ProteinNode(Node n) {
        super(n);
    }

    public String getName() {
        return String.valueOf(node.getProperty(NAME_PROPERTY));
    }

    public String getFullName(){
        return String.valueOf(node.getProperty(FULL_NAME_PROPERTY));
    }

    public String getShortName(){
        return String.valueOf(node.getProperty(SHORT_NAME_PROPERTY));
    }

    public String getAccession() {
        return String.valueOf(node.getProperty(ACCESSION_PROPERTY));
    }

    public String getSequence() {
        return String.valueOf(node.getProperty(SEQUENCE_PROPERTY));
    }

    public String getEnsemblId(){
        return String.valueOf(node.getProperty(ENSEMBL_ID_PROPERTY));
    }

    public String[] getEMBLreferences(){
        return (String[]) node.getProperty(EMBL_REFERENCES_PROPERTY);
    }
    
    public String[] getRefseqReferences(){
        return (String[]) node.getProperty(REFSEQ_REFERENCES_PROPERTY);
    }

    public String[] getAlternativeAcessions(){
        return (String[]) node.getProperty(ALTERNATIVE_ACCESSIONS_PROPERTY);
    }

    public String getPIRId(){
        return String.valueOf(node.getProperty(PIR_ID_PROPERTY));
    }

    public String getKeggId(){
        return String.valueOf(node.getProperty(KEGG_ID_PROPERTY));
    }

    public String getArrayExpressId(){
        return String.valueOf(node.getProperty(ARRAY_EXPRESS_ID_PROPERTY));
    }

    public String getUniGeneId(){
        return String.valueOf(node.getProperty(UNIGENE_ID_PROPERTY));
    }

    public String getModifiedDate(){
        return String.valueOf(node.getProperty(MODIFIED_DATE_PROPERTY));
    }

    public float getMass() {
        return Float.parseFloat(String.valueOf(node.getProperty(MASS_PROPERTY)));
    }

    public int getLength() {
        return Integer.parseInt(String.valueOf(node.getProperty(LENGTH_PROPERTY)));
    }

    public String[] getGeneNames(){
        return (String[])node.getProperty(GENE_NAMES_PROPERTY);
    }

//    public String[] getGeneNamesArray(){
//        return String.valueOf(node.getProperty(GENE_NAMES_PROPERTY)).split(GENE_NAMES_SEPARATOR);
//    }

    public OrganismNode getOrganism() {
        OrganismNode org = null;
        Relationship rel = node.getSingleRelationship(new ProteinOrganismRel(null), Direction.OUTGOING);
        if (rel != null) {
            org = new OrganismNode(rel.getEndNode());
        }
        return org;
    }
    

    public DatasetNode getDataset(){
        DatasetNode dataset = null;
        Relationship rel = node.getSingleRelationship(new ProteinDatasetRel(null), Direction.OUTGOING);
        if(rel != null){
            dataset = new DatasetNode(rel.getEndNode());
        }
        return dataset;
    }
    
    public List<GenomeElementNode> getGenomeElements(){
        List<GenomeElementNode> list = new ArrayList<GenomeElementNode>();
        Iterator<Relationship> iterator = node.getRelationships(new ProteinGenomeElementRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            list.add(new GenomeElementNode(iterator.next().getEndNode()));
        }
        return list;
    }

    
    public List<SubcellularLocationNode> getSubcellularLocations(){
        List<SubcellularLocationNode> list = new ArrayList<SubcellularLocationNode>();        
        Iterator<Relationship> iterator = node.getRelationships(new ProteinSubcellularLocationRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            list.add(new SubcellularLocationNode(iterator.next().getEndNode()));
        }
        return list;
    }
    
    public List<InterproNode> getInterpro(){
        List<InterproNode> interpros = new ArrayList<InterproNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new ProteinInterproRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            InterproNode interpro = new InterproNode(iterator.next().getEndNode());
            interpros.add(interpro);                        
        }
        return interpros;  
    }
    
    public List<GoTermNode> getGOAnnotations(){
        List<GoTermNode> list = new ArrayList<GoTermNode>();
        Iterator<Relationship> iterator = node.getRelationships(new ProteinGoRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            GoTermNode goTerm = new GoTermNode(iterator.next().getEndNode());
            list.add(goTerm);                        
        }        
        return list;
    }
    
    public List<KeywordNode> getKeywords(){
        List<KeywordNode> keywords = new ArrayList<KeywordNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new ProteinKeywordRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            KeywordNode keyword = new KeywordNode(iterator.next().getEndNode());
            keywords.add(keyword);                        
        }
        return keywords;  
    }
    
    public List<FunctionCommentRel> getFunctionComment(){
        List<FunctionCommentRel> list = new ArrayList<FunctionCommentRel>();
        
        Iterator<Relationship> iterator = node.getRelationships(new FunctionCommentRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            FunctionCommentRel rel = new FunctionCommentRel(iterator.next());
            list.add(rel);                        
        }        
        return list;
    }
    
    public List<PathwayCommentRel> getPathwayComment(){
        List<PathwayCommentRel> list = new ArrayList<PathwayCommentRel>();
        
        Iterator<Relationship> iterator = node.getRelationships(new PathwayCommentRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            PathwayCommentRel rel = new PathwayCommentRel(iterator.next());
            list.add(rel);                        
        }        
        return list;
    }
    
    public List<DomainCommentRel> getDomainComment(){
        List<DomainCommentRel> list = new ArrayList<DomainCommentRel>();
        
        Iterator<Relationship> iterator = node.getRelationships(new DomainCommentRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            DomainCommentRel rel = new DomainCommentRel(iterator.next());
            list.add(rel);                        
        }        
        return list;
    }
    
    public List<SimilarityCommentRel> getSimilarityComment(){
        List<SimilarityCommentRel> list = new ArrayList<SimilarityCommentRel>();
        
        Iterator<Relationship> iterator = node.getRelationships(new SimilarityCommentRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            SimilarityCommentRel rel = new SimilarityCommentRel(iterator.next());
            list.add(rel);                        
        }        
        return list;
    }
    
    /**
     * Protein-protein interactions
     * @return 
     */
    public List<ProteinProteinInteractionRel> getProteinInteractions(){
        List<ProteinProteinInteractionRel> list = new ArrayList<ProteinProteinInteractionRel>();
        
        Iterator<Relationship> iterator = node.getRelationships(new ProteinProteinInteractionRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinProteinInteractionRel(iterator.next()));
        }
        
        return list;
    }
    
    /**
     * Protein-Isoform interactions
     * @return 
     */
    public List<ProteinIsoformInteractionRel> getIsoformInteractions(){
        List<ProteinIsoformInteractionRel> list = new ArrayList<ProteinIsoformInteractionRel>();
        
        Iterator<Relationship> iterator = node.getRelationships(new ProteinIsoformInteractionRel(null), Direction.OUTGOING).iterator();
        while(iterator.hasNext()){
            list.add(new ProteinIsoformInteractionRel(iterator.next()));
        }
        
        return list;
    }
    
    //---------------------------------------------------------------------------------------------
    //-------------------------------------CITATIONS-----------------------------------------------
    //---------------------------------------------------------------------------------------------
    
    /**
     * Protein article citations
     * @return 
     */
    public List<ArticleNode> getArticleCitations(){
        List<ArticleNode> list = new ArrayList<ArticleNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new ArticleProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new ArticleNode(iterator.next().getStartNode()));
        }
        return list;
    }
    /**
     * Protein submission citations
     * @return 
     */
    public List<SubmissionNode> getSubmissionCitations(){
        List<SubmissionNode> list = new ArrayList<SubmissionNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new SubmissionProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new SubmissionNode(iterator.next().getStartNode()));
        }
        return list;
    }
    /**
     * Protein Online article citations
     * @return 
     */
    public List<OnlineArticleNode> getOnlineArticleCitations(){
        List<OnlineArticleNode> list = new ArrayList<OnlineArticleNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new OnlineArticleProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new OnlineArticleNode(iterator.next().getStartNode()));
        }
        return list;
    } 
    /**
     * Protein Book citations
     * @return 
     */
    public List<BookNode> getBookCitations(){
        List<BookNode> list = new ArrayList<BookNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new BookProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new BookNode(iterator.next().getStartNode()));
        }
        return list;
    }
    /**
     * Protein patent citations
     * @return 
     */
    public List<PatentNode> getPatentCitations(){
        List<PatentNode> list = new ArrayList<PatentNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new PatentProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new PatentNode(iterator.next().getStartNode()));
        }
        return list;
    }
    /**
     * Protein thesis citations
     * @return 
     */
    public List<ThesisNode> getThesisCitations(){
        List<ThesisNode> list = new ArrayList<ThesisNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new ThesisProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new ThesisNode(iterator.next().getStartNode()));
        }
        return list;
    }
    /**
     * Protein unpublished observations citations
     * @return 
     */
    public List<UnpublishedObservationNode> getUnpublishedObservationsCitations(){
        List<UnpublishedObservationNode> list = new ArrayList<UnpublishedObservationNode>();
        
        Iterator<Relationship> iterator = node.getRelationships(new UnpublishedObservationProteinCitationRel(null), Direction.INCOMING).iterator();
        while(iterator.hasNext()){
            list.add(new UnpublishedObservationNode(iterator.next().getStartNode()));
        }
        return list;
    }
    //---------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------------
    
    public void setName(String value) {
        node.setProperty(NAME_PROPERTY, value);
    }

    public void setFullName(String value){
        node.setProperty(FULL_NAME_PROPERTY, value);
    }

    public void setShortName(String value){
        node.setProperty(SHORT_NAME_PROPERTY, value);
    }

    public void setAccession(String value) {
        node.setProperty(ACCESSION_PROPERTY, value);
    }

    public void setSequence(String value) {
        node.setProperty(SEQUENCE_PROPERTY, value);
    }

    public void setModifiedDate(String value){
        node.setProperty(MODIFIED_DATE_PROPERTY, value);
    }

    public void setEnsemblId(String value){
        node.setProperty(ENSEMBL_ID_PROPERTY, value);
    }

    public void setKeggId(String value){
        node.setProperty(KEGG_ID_PROPERTY, value);
    }

    public void setPIRId(String value){
        node.setProperty(PIR_ID_PROPERTY, value);
    }

    public void setEMBLreferences(String[] value){
        node.setProperty(EMBL_REFERENCES_PROPERTY, value);
    }

    public void setRefseqReferences(String[] value){
        node.setProperty(REFSEQ_REFERENCES_PROPERTY, value);
    }
    
    public void setAlternativeAccessions(String[] value){
        node.setProperty(ALTERNATIVE_ACCESSIONS_PROPERTY, value);
    }

    public void setArrayExpressId(String value){
        node.setProperty(ARRAY_EXPRESS_ID_PROPERTY, value);
    }

    public void setUniGeneId(String value){
        node.setProperty(UNIGENE_ID_PROPERTY, value);
    }

    public void setMass(float value) {
        node.setProperty(MASS_PROPERTY, value);
    }

    public void setLength(int value) {
        node.setProperty(LENGTH_PROPERTY, value);
    }

    public void setGeneNames(String[] value){
        node.setProperty(GENE_NAMES_PROPERTY, value);
    }
    

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ProteinNode) {
            ProteinNode other = (ProteinNode) obj;
            return this.node.equals(other.node);
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        
        String geneNamesSt = "";        
        for (String geneName : getGeneNames()) {
            geneNamesSt += geneName + ", ";
        }
        if(geneNamesSt.length() > 0){
            geneNamesSt = geneNamesSt.substring(0,geneNamesSt.length() - 2);
        }
        
        String emblReferencesSt = "";        
        for (String emblReference : getEMBLreferences()) {
            emblReferencesSt += emblReference + ", ";
        }
        if(emblReferencesSt.length() > 0){
            emblReferencesSt = emblReferencesSt.substring(0,emblReferencesSt.length() - 2);
        }
        
        
        
        String result = "\naccession = " + this.getAccession() +
                "\nname = " + this.getName() +
                "\nfull name = " + this.getFullName() +
                "\nshort name = " + this.getShortName() + 
                "\nmodified date = " + this.getModifiedDate() +
                "\nmass = " + this.getMass() +
                "\nlength = " + this.getLength() +
                "\ngene names = " + geneNamesSt +
                "\nEMBL references = " + emblReferencesSt +
                "\nPIR id = " + this.getPIRId() +
                "\nKegg id = " + this.getKeggId() +
                "\nArrayExpress id = " + this.getArrayExpressId() +
                "\nEnsembl id = " + this.getEnsemblId() +
                "\nUniGene id = " + this.getUniGeneId() + 
                "\nsequence = " + this.getSequence();

        return result;
    }
}
