/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import User.TransactionServlet;
import User.User;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

public class trans {
    
     public static void insert(TransactionServlet transaction) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        try {
            em.persist(transaction);
            trans.commit();
        } catch (Exception e) {
            System.out.println(e);
            trans.rollback();
        } finally {
            em.close();
        }
    }


    public static List<TransactionServlet> selectTrans(User user) {
        EntityManager em = DBUtil.getEmFactory().createEntityManager();
        String qString = "SELECT t FROM Trans t "
                + "WHERE t.account = :user";
        TypedQuery<TransactionServlet> q = em.createQuery(qString, TransactionServlet.class);
        q.setParameter("user", user);
        List<TransactionServlet> transactions;
        try {
            transactions = q.getResultList();
            if(transactions == null || transactions.isEmpty())
                transactions = null;
        } 
        finally {
            em.close();
        }
        return transactions;
    }

}
