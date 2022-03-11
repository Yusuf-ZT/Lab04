
package models;

import java.io.Serializable;

/**
 *
 * @author 761450
 */
public class Note implements Serializable {
    private String titleNote;
    private String contentNote;

    public Note() {
        titleNote = "";
        contentNote = "";
    }

    public Note(String titleNote, String ContentNote) {
        this.titleNote = titleNote;
        this.contentNote = ContentNote;
    }

    public String getTitleNote() {
        return titleNote;
    }

    public void setTitleNote(String titleNote) {
        this.titleNote = titleNote;
    }

    public String getContentNote() {
        return contentNote;
    }

    public void setContentNote(String contentNote) {
        this.contentNote = contentNote;
    }
    
    
    
    
    
}
