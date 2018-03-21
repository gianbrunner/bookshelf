package controllers;

import play.*;
import play.mvc.*;


public class BookController extends Controller{

    public Result getBooks(String book){
        return ok("getBooks works!");
    }
    public Result createBook(){
        return ok("createBook works!");
    }
    public Result changeBook(int id){
        return ok("changeBook works!");
    }
    public Result getBook(int id){
        return ok("getBook works!");
    }
    public Result deleteBook(int id){
        return ok("deleteBook works!");
    }

}
