/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pl7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author bruno
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.mycompany.pl7.ContadorTest.class, com.mycompany.pl7.GasTest.class, com.mycompany.pl7.EletricidadeTest.class, com.mycompany.pl7.EletricidadeSimplesTest.class, com.mycompany.pl7.TesteContadorTest.class, com.mycompany.pl7.EletricidadeBHTest.class})
public class Pl7Suite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}