
package servlets;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;

/**
 *
 * @author 761450
 */
public class NoteServlet extends HttpServlet {


 
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        String edit = request.getParameter("editnote");
        try (BufferedReader br = new BufferedReader(new FileReader(new File(path)))) {
            String line = br.readLine();
            if (line != null){ //this is returning null, figure out why
                System.out.println(line);
                //Reads next line
                line = br.readLine();
                br.close();
                
                

            }
        }
        

       
       if(edit != null){
           getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
           
       } else  
       getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       return;
       
    
    
    }
    
    
      
  

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String titleNote = request.getParameter("title");
        String contentNote = request.getParameter("content");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        
        
        
        
        
        /*
        Make this into an arry and you can say array line 0 = title, array line 1 = content
        String viewNote = line;
        String viewNote1 = line;
        Note defaultNote = new Note(viewNote, viewNote1);
        request.setAttribute("note", defaultNote);
        System.out.println(defaultNote);
        */
    
            //if action is not null(save pressed)
    if (request.getParameter("action") != null){ 
        Note note = new Note(titleNote, contentNote);
        request.setAttribute("note", note);
       
          getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
            return;
    } else {
        
    }
      

        
        
        
            
          
           
        
       /* 
       String titleNote = request.getParameter("title");
       String contentNote = request.getParameter("content");
       
       Note note = new Note(titleNote, contentNote);
       request.setAttribute("note", note);
       
       if(titleNote == null || titleNote.equals("") || contentNote == null || contentNote.equals("")){
           request.setAttribute("error", true);
           System.out.println("error");
       }
       */

       

    }
}


