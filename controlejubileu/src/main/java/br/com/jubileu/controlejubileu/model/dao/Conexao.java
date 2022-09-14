package br.com.jubileu.controlejubileu.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
  private Connection conn;
  public Connection criarConexao() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jubileu","root","");
    } catch(Exception ex){
      
    }
    return this.conn;
  }
  public void fecharConexao() {
	  try {
		  this.conn.close();
	  } catch (Exception e) {
      
	  }
  }
}