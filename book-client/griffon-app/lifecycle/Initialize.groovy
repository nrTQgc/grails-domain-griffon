/*
 * This script is executed inside the UI thread, so be sure to  call 
 * long running code in another thread.
 *
 * You have the following options
 * - execOutsideUI { // your code }
 * - execFuture { // your code }
 * - Thread.start { // your code }
 *
 * You have the following options to run code again inside the UI thread
 * - execInsideUIAsync { // your code }
 * - execInsideUISync { // your code }
 */

import groovy.swing.SwingBuilder
import static griffon.util.GriffonApplicationUtils.isMacOSX
import grails.orm.bootstrap.*
import grails.persistence.*
import org.springframework.jdbc.datasource.DriverManagerDataSource

SwingBuilder.lookAndFeel((isMacOSX ? 'system' : 'nimbus'), 'gtk', ['metal', [boldFonts: false]])

//TODO Should be a Spring bean
new HibernateDatastoreSpringInitializer("com.nortia.book")
