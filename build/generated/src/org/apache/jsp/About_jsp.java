package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/CSS3 Menu.html");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>\n");
      out.write("Student Information System\n");
      out.write("</title>\n");
      out.write("    <style>\n");
      out.write("    #img2{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    #img3{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    #img4{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    #img5{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    #img6{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    #img7{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    #img8{\n");
      out.write("        max-width: 100%;\n");
      out.write("    }\n");
      out.write("    .demo p{\n");
      out.write("        padding: 10px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("    .departments{\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .sicon{width:800px;\n");
      out.write("margin:0 auto;\n");
      out.write("}\n");
      out.write(".sicon ul {\n");
      out.write("text-align:right;\n");
      out.write("}\n");
      out.write(".sicon ul li {\n");
      out.write("list-style-type:none;\n");
      out.write("display:inline;\n");
      out.write("}\n");
      out.write(".sicon ul li a{\n");
      out.write("opacity:0.7;\n");
      out.write("padding:5px 10px 5px 10px;\n");
      out.write("}\n");
      out.write(".sicon ul li a:hover{\n");
      out.write("opacity:1;\n");
      out.write("}\n");
      out.write("\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color: rgb(243,254,255);\">\n");
      out.write("    \n");
      out.write("<div align=\"center\">  \n");
      out.write("      <img src=\"studentinfo.jpg\" width=100 height=80 id=\"img1\"/>\n");
      out.write("<font face=\"vijaya\" size=30px color=\"black\">STUDENT INFORMATION SYSTEM</font>\n");
      out.write("</div>\n");
      out.write("    </br>\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<title>css3menu.com</title>\r\n");
      out.write("\t\t<!-- Start css3menu.com HEAD section -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"CSS3 Menu_files/css3menu1/style.css\" type=\"text/css\" /><style type=\"text/css\">._css3m{display:none}</style>\r\n");
      out.write("\t<!-- End css3menu.com HEAD section -->\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#EBEBEB\">\r\n");
      out.write("<!-- Start css3menu.com BODY section -->\r\n");
      out.write("<ul id=\"css3menu1\" class=\"topmenu\">\r\n");
      out.write("\t<li class=\"topfirst\"><a href=\"Home.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/home.png\" alt=\"\"/>HOME</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"About.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/find.png\" alt=\"\"/>ABOUT</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"Contact.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/help.png\" alt=\"\"/>CONTACT US</a></li>\r\n");
      out.write("\t<li class=\"topmenu\"><a href=\"#\" style=\"height:32px;line-height:32px;\"><span><img src=\"CSS3 Menu_files/css3menu1/favour.png\" alt=\"\"/>REGISTER</span></a>\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"StudentRegistrationForm.jsp\">STUDENT</a></li>\r\n");
      out.write("\t\t<li><a href=\"FacultyRegistrationForm.jsp\">FACULTY</a></li>\r\n");
      out.write("\t</ul></li>\r\n");
      out.write("\t<li class=\"toplast\"><a href=\"Login.jsp\" style=\"height:32px;line-height:32px;\"><img src=\"CSS3 Menu_files/css3menu1/service.png\" alt=\"\"/>LOGIN</a></li>\r\n");
      out.write("</ul><p class=\"_css3m\"><a href=\"http://css3menu.com/\">HTML Top Menu </a> by Css3Menu.com</p>\r\n");
      out.write("<!-- End css3menu.com BODY section -->\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("<div class=\"demo\" align=\"center\">\n");
      out.write("  <h2 align=\"center\">DEPARTMENTS</h2>\n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("    <pre>\n");
      out.write("    <h3 align=\"center\"><font face=\"vijaya\" color=\"black\">COMPUTER DEPARTMENT</font></h3>\n");
      out.write("    <img src=\"computerdepartment.png\" id=\"img3\" />\n");
      out.write("    <p><font face=\"vijaya\" size=3px color=\"black\">The University offers the Computer Science Department which follows the latest syllabus and the latest technology labs and other facilities<br>\n");
      out.write("         for the students to make their life better. The course offers many projects to the students so that the students can be able to involve<br>\n");
      out.write("        in the projects as they have to do live in the future. More better courses offered for the students as per the booming technologies in the society.<br>\n");
      out.write("    </p>\n");
      out.write("    \n");
      out.write("    <h3 align=\"center\"><font face=\"vijaya\" color=\"black\">ELECTRONICS AND COMMUNICATION</font></h3>\n");
      out.write("    <img src=\"ECEDEPARTMENT.png\" id=\"img4\" />\n");
      out.write("    <p><font face=\"vijaya\" size=3px color=\"black\">The University offers the Electronics and communication Department which follows the latest syllabus and the latest technology labs and other facilities<br>\n");
      out.write("         for the students to make their life better. The course offers many projects to the students so that the students can be able to involve<br>\n");
      out.write("        in the projects as they have to do live in the future. More better courses offered for the students as per the booming technologies in the society.<br>\n");
      out.write("    </p>\n");
      out.write("    <h3 align=\"center\"><font face=\"vijaya\" color=\"black\">ELECTRICAL</font></h3>\n");
      out.write("    <img src=\"ELECTRICALDEPARTMENT.png\" id=\"img5\" />\n");
      out.write("    <p><font face=\"vijaya\" size=3px color=\"black\">The University offers the Electrical Department which follows the latest syllabus and the latest technology labs and other facilities<br>\n");
      out.write("         for the students to make their life better. The course offers many projects to the students so that the students can be able to involve<br>\n");
      out.write("        in the projects as they have to do live in the future. More better courses offered for the students as per the booming technologies in the society.<br>\n");
      out.write("    </p>\n");
      out.write("    <h3 align=\"center\"><font face=\"vijaya\" color=\"black\">CIVIL</font></h3>\n");
      out.write("    <img src=\"CIVIL DEPARTMENT.jpg\" id=\"img6\" />\n");
      out.write("    <p><font face=\"vijaya\" size=3px color=\"black\">The University offers the Civil Department which follows the latest syllabus and the latest technology labs and other facilities<br>\n");
      out.write("         for the students to make their life better. The course offers many projects to the students so that the students can be able to involve<br>\n");
      out.write("        in the projects as they have to do live in the future. More better courses offered for the students as per the booming technologies in the society.<br>\n");
      out.write("    </p>\n");
      out.write("    <h3 align=\"center\"><font face=\"vijaya\" color=\"black\">MECHANICAL</font></h3>\n");
      out.write("    <img src=\"mechanicaldepartment.jpg\" id=\"img7\" />\n");
      out.write("    <p><font face=\"vijaya\" size=3px color=\"black\">The University offers the Mechanical Department which follows the latest syllabus and the latest technology labs and other facilities<br>\n");
      out.write("         for the students to make their life better. The course offers many projects to the students so that the students can be able to involve<br>\n");
      out.write("        in the projects as they have to do live in the future. More better courses offered for the students as per the booming technologies in the society.<br>\n");
      out.write("    </p>\n");
      out.write("    <h3 align=\"center\"><font face=\"vijaya\" color=\"black\">AERONAUTICAL</font></h3>\n");
      out.write("    <img src=\"AERONUATICALDEPARTMENT.jpg\" id=\"img8\" />\n");
      out.write("    <p><font face=\"vijaya\" size=3px color=\"black\">The University offers the Aeronautical Department which follows the latest syllabus and the latest technology labs and other facilities<br>\n");
      out.write("         for the students to make their life better. The course offers many projects to the students so that the students can be able to involve<br>\n");
      out.write("        in the projects as they have to do live in the future. More better courses offered for the students as per the booming technologies in the society.<br>\n");
      out.write("    </p>\n");
      out.write("\n");
      out.write("<br>\n");
      out.write("<h2 align=\"center\">PORTAL</h2>\n");
      out.write("<p><font face=\"vijaya\" size=3px color=\"black\">The Portal is very user friendly for the student and the patient so that they can easily use the interface. The Student or the faculty should <br>\n");
      out.write("          first register in the portal in the Register Menu for desired account. The Student can check the attendance percentage of the class he attends.<br>\n");
      out.write("        The Student can check the Marks gained by them in the particular subject. The student can view the grades he secured. The Student can <br>\n");
      out.write("        submit the assignments. The faculty will upload the information of the student that is marks of the student, attendance of the student, assign the projects/work.<br>\n");
      out.write("    </p>\n");
      out.write(" <div class=\"sicon\">\n");
      out.write("<ul>\n");
      out.write("<li><a href=\"https://www.facebook.com/\"><img src=\"si1.png\" /></a></li><li><a href=\"https://www.linkedin.com/uas/login\"><img src=\"si2.png\" /></a></li><li><a href=\"https://twitter.com/login/\"><img src=\"si3.png\" /></a></li><li><a href=\"https://plus.google.com\"><img src=\"si4.png\" /></a></li>\n");
      out.write("</ul></div>\n");
      out.write("    \n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
