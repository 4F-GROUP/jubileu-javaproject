package br.com.jubileu.controlejubileu.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
  private Connection conn;
  public Connection criarConexao() {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jubileu","root","");
    } catch(Exception e){
      
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