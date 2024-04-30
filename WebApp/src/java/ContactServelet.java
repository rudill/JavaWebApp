@WebServlet("/contact")
public class ContactServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        String message = request.getParameter("message");

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = DbConnection.getConnection();
            String sql = "INSERT INTO contacts (first_name, last_name, email, message) VALUES (?, ?, ?, ?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, firstName);
            statement.setString(2, lastName);
            statement.setString(3, email);
            statement.setString(4, message);
            statement.executeUpdate();

            response.getWriter().println("<p>Thank you for contacting us! Your message has been submitted.</p>");
        } catch (SQLException e) {
            response.getWriter().println("<p>Error submitting message: " + e.getMessage() +
