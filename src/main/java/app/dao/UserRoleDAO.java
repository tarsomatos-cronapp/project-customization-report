package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("UserRoleDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface UserRoleDAO extends JpaRepository<UserRole, java.lang.String> {

  /**
   * Obtém a instância de UserRole utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM UserRole entity WHERE entity.id = :id")
  public UserRole findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de UserRole utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM UserRole entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * Foreign Key role
   * @generated
   */
  @Query("SELECT entity FROM UserRole entity WHERE entity.role.id = :id")
  public Page<UserRole> findUserRolesByRole(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key user
   * @generated
   */
  @Query("SELECT entity FROM UserRole entity WHERE entity.user.id = :id")
  public Page<UserRole> findUserRolesByUser(@Param(value="id") java.lang.String id, Pageable pageable);

}
