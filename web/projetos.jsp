<%@page import="namastech.mvc.entidades.Projeto"%>
<%@page import="java.util.List"%>
<!doctype html>
<html>
    <head>
        <meta charset="utf-8">
        <title>Sistema</title>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <link rel="icon" href="images/icon.png" type="image/x-icon" />
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">

        <%
            List<Projeto> resultados = (List<Projeto>) request.getAttribute("projetos");
        %>
    </head>

    <body>
        <div class="interesse" style="display:none; z-index:4; background:white; border:1px solid gray; position:absolute;"></div>
        <div class="container" style="margin-top:10px">
            <div class="row">
                <div class="col-md-12">
                    <div class="table-responsive">
                        <table class="table">
                          <thead class="thead-dark">
                            <tr>
                              <th scope="col">O.S</th>
                              <th scope="col">Clientes</th>
                              <th scope="col">QTA</th>
                              <th scope="col">Trabalho</th>
                              <th class="hidden-xs" scope="col">Status</th>
                              <th scope="col">Informações</th>
                              <th class="hidden-xs" scope="col">Opções</th>
                            </tr>
                          </thead>
                          <tbody>
                            <% if (resultados.size() < 1) { %>
                                Nenhum projeto para desenvolver!
                            <%
                            } else {
                                for (int i = 0; i < resultados.size(); i++) {
                            %>
                            <% if (resultados.get(i).getAtivo()) { %>
                                <tr id="trb001">
                            <% } else { %>
                                <tr class="danger alert-danger" id="trb001">
                            <% }%>
                                <th><%= resultados.get(i).getId()%></th>
                                <th><%= resultados.get(i).getNomeCliente()%></th>
                                <th><%= resultados.get(i).getQuantidade()%></th>
                                <th><%= resultados.get(i).getDescricao()%></th>
                                <th class="hidden-xs">
                                    <% if (resultados.get(i).getAtivo()) { %>
                                    Ativo
                                    <% } else { %>
                                    Inativo
                                    <% } %>
                                </th>
                                <th>
                                    <% if (resultados.get(i).getObservacao() == null || resultados.get(i).getObservacao().isEmpty()) { %>
                                        Sem observações
                                    <% } else {
                                         out.print(resultados.get(i).getObservacao());
                                    }%>
                                </th>


                                <th class="hidden-xs"><a href="finalizaProjeto?id=<%= resultados.get(i).getId() %>"> 
                                    <% if (resultados.get(i).getAtivo()) { %>
                                        Finalizar projeto
                                    <% } else { %>
                                        Reabrir Projeto
                                    <% } %>
                                    </a>
                                </th>
                            </tr>
                             <%
                                        }
                                    }
                                %>
                            
                          </tbody>
                        </table>
                       
                               
                    </div>	
                </div>
            </div>
        </div>

        <script src="js/jquery.min.js"></script>
        <script src="js/app.js"></script>
    </body>
</html>
