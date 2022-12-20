///*
//Enter your code here.
//Create all the necessary classes and methods as per the requirements.
//*/
//// START of your code
//import java.util.Objects;
//import java.util.Scanner;
//import java.util.ArrayList;
//
//class Position{
//    private int x;
//    private int y;
//    Position(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//    public void setX(int x){
//        this.x = x;
//    }
//    public void setY(int y){
//        this.y = y;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//    @Override
//    public boolean equals(Object a){
//        if(this == a){
//            return true;
//        }
//        if(a == null || getClass() != a.getClass()){
//            return false;
//        }
//        Position b = (Position) a;
//        return x == b.x && y == b.y;
//    }
//    @Override
//    public String toString(){
//        return "("+x+","+y+")";
//    }
//}
//
//class Game{
//    private Map map;
//    private ArrayList<Player> players = new ArrayList<Player>();
//    Game(Map map){
//        this.map = map;
//    }
//    public void addPlayer(Player pl){
//        pl.setMap(map);
//        this.players.add(pl);
//    }
//}
//
//class Map {
//    private int size;
//    private char[][] mp;
//    Map(Scanner s) throws InvalidMapException{
//        int temp = s.nextInt();
//        if(temp == 0){
//            throw new InvalidMapException("Map size can not be zero");
//        }
//        this.size = temp;
//        mp = new char[size][size];
//        for(int i = 0; i<size;i++){
//            for(int j = 0; j <size;j++){
//                if(!s.hasNext()){
//                    throw new InvalidMapException("Not enough map elements");
//                }
//                mp[i][j] = s.next().charAt(0);
//            }
//        }
//    }
//    public int getSize(){
//        return size;
//    }
//    public char getValueAt(int x, int y){
//        return mp[y][x];
//    }
//    public void print(){
//        for(int i = 0; i<size;i++){
//            for(int j = 0; j <size;j++){
//                System.out.print((char)mp[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class InvalidMapException extends Exception {
//    InvalidMapException(String s){
//        super(s);
//    }
//}
//interface Player{
//    void moveRight();
//    void moveLeft();
//    void moveUp();
//    void moveDown();
//    void setMap(Map m);
//    Position getPosition();
//}
//
//class MyPlayer implements Player{
//    private Map map;
//    private Position p;
//    MyPlayer(){
//
//    }
//    MyPlayer(Map map){
//        setMap(map);
//    }
//    @Override
//    public void moveRight(){
//        if(p.getX()+1 < map.getSize()){
//            if(map.getValueAt(p.getX()+1, p.getY()) == '0' || map.getValueAt(p.getX()+1, p.getY()) == 'P'){
//                p.setX(p.getX()+1);
//            }
//        }
//    }
//    @Override
//    public void moveLeft(){
//        if(p.getX()-1 >= 0){
//            if(map.getValueAt(p.getX()-1, p.getY()) == '0' || map.getValueAt(p.getX()-1, p.getY()) == 'P'){
//                p.setX(p.getX()-1);
//            }
//        }
//    }
//    @Override
//    public void moveUp(){
//        if(p.getY() - 1 >= 0){
//            if(map.getValueAt(p.getX(), p.getY()-1)== '0' || map.getValueAt(p.getX(), p.getY()-1) == 'P'){
//                p.setY(p.getY()-1);
//            }
//        }
//    }
//    @Override
//    public void moveDown(){
//        if(p.getY() + 1 < map.getSize()){
//            if(map.getValueAt(p.getX(), p.getY()+1)== '0' || map.getValueAt(p.getX(), p.getY()+1) == 'P'){
//                p.setY(p.getY()+1);
//            }
//        }
//    }
//    @Override
//    public void setMap(Map map){
//        this.map = map;
//        for(int i = 0; i<map.getSize();i++){
//            for(int j = 0; j <map.getSize();j++){
//                if(map.getValueAt(i, j)=='P'){
//                    p = new Position(i,j);
//                }
//            }
//        }
//    }
//    @Override
//    public Position getPosition(){
//        return p;
//    }
//
//
//
//}
//// END of your code.
///*
//DO NOT MODIFY THIS PART!!!
//Input and Output has been done for you.
//Various conditions are meant to check individual classes separately.
//You still need to implement completely all the necessary classes with their corresponding methods,
//but the correctness for each class is checked individually.
//In other words, you already get some partial points for implementing some classes completely and correctly,
//even if other classes are complete but still may not work properly.
//*/
//public class Solution{
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String className = input.nextLine();
//
//        // Checking the implementation of the Position class
//        if(className.equals("Position")){
//            Position p1 = new Position(input.nextInt(), input.nextInt());
//            System.out.println(p1);
//            p1.setX(5);
//            System.out.println(p1.getX());
//
//            Position p2 = new Position(5, 10);
//            System.out.println(p1.equals(p2));
//        }
//
//        // Checking the implementation of the Map class
//        else if(className.equals("Map")){
//            try{
//                Map map = new Map(input);
//                map.print();
//                int size = map.getSize();
//                System.out.println(size);
//                System.out.println(map.getValueAt(size/2, size/2));
//            }
//            catch(Exception e){}
//        }
//
//        // Checking the Player interface and the MyPlayer class
//        else if(className.equals("Player")){
//            Player player = new MyPlayer();
//            System.out.println(Player.class.isInterface());
//            System.out.println(player instanceof Player);
//            System.out.println(player instanceof MyPlayer);
//        }
//
//        // Checking the InvalidMapException class
//        else if(className.equals("Exception")){
//            try{
//                throw new InvalidMapException("Some message");
//            }
//            catch(InvalidMapException e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        // Checking the Game class and all of its components
//        else if(className.equals("Game")){
//
//            // Initialize player, map, and the game
//            Player player = new MyPlayer();
//            Game game = null;
//
//            try{
//                game = new Game(new Map(input));
//            }
//            catch(InvalidMapException e){ // custom exception
//                System.out.println(e.getMessage());
//                System.exit(0);
//            }
//
//            game.addPlayer(player);
//
//            // Make the player move based on the commands given in the input
//            String moves = input.next();
//            char move;
//            for(int i=0; i<moves.length(); i++){
//                move = moves.charAt(i);
//                switch(move){
//                    case 'R':
//                        player.moveRight();
//                        break;
//                    case 'L':
//                        player.moveLeft();
//                        break;
//                    case 'U':
//                        player.moveUp();
//                        break;
//                    case 'D':
//                        player.moveDown();
//                        break;
//                }
//            }
//
//            // Determine the final position of the player after completing all the moves above
//            Position playerPosition = player.getPosition();
//            System.out.println("Player final position");
//            System.out.println("Row: " + playerPosition.getY());
//            System.out.println("Col: " + playerPosition.getX());
//        }
//    }
//}/*
//Enter your code here.
//Create all the necessary classes and methods as per the requirements.
//*/
//// START of your code
//import java.util.Objects;
//        import java.util.Scanner;
//        import java.util.ArrayList;
//
//class Position{
//    private int x;
//    private int y;
//    Position(int x, int y){
//        this.x = x;
//        this.y = y;
//    }
//    public void setX(int x){
//        this.x = x;
//    }
//    public void setY(int y){
//        this.y = y;
//    }
//    public int getX(){
//        return x;
//    }
//    public int getY(){
//        return y;
//    }
//    @Override
//    public boolean equals(Object a){
//        if(this == a){
//            return true;
//        }
//        if(a == null || getClass() != a.getClass()){
//            return false;
//        }
//        Position b = (Position) a;
//        return x == b.x && y == b.y;
//    }
//    @Override
//    public String toString(){
//        return "("+x+","+y+")";
//    }
//}
//
//class Game{
//    private Map map;
//    private ArrayList<Player> players = new ArrayList<Player>();
//    Game(Map map){
//        this.map = map;
//    }
//    public void addPlayer(Player pl){
//        pl.setMap(map);
//        this.players.add(pl);
//    }
//}
//
//class Map {
//    private int size;
//    private char[][] mp;
//    Map(Scanner s) throws InvalidMapException{
//        int temp = s.nextInt();
//        if(temp == 0){
//            throw new InvalidMapException("Map size can not be zero");
//        }
//        this.size = temp;
//        mp = new char[size][size];
//        for(int i = 0; i<size;i++){
//            for(int j = 0; j <size;j++){
//                if(!s.hasNext()){
//                    throw new InvalidMapException("Not enough map elements");
//                }
//                mp[i][j] = s.next().charAt(0);
//            }
//        }
//    }
//    public int getSize(){
//        return size;
//    }
//    public char getValueAt(int x, int y){
//        return mp[y][x];
//    }
//    public void print(){
//        for(int i = 0; i<size;i++){
//            for(int j = 0; j <size;j++){
//                System.out.print((char)mp[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }
//}
//class InvalidMapException extends Exception {
//    InvalidMapException(String s){
//        super(s);
//    }
//}
//interface Player{
//    void moveRight();
//    void moveLeft();
//    void moveUp();
//    void moveDown();
//    void setMap(Map m);
//    Position getPosition();
//}
//
//class MyPlayer implements Player{
//    private Map map;
//    private Position p;
//    MyPlayer(){
//
//    }
//    MyPlayer(Map map){
//        setMap(map);
//    }
//    @Override
//    public void moveRight(){
//        if(p.getX()+1 < map.getSize()){
//            if(map.getValueAt(p.getX()+1, p.getY()) == '0' || map.getValueAt(p.getX()+1, p.getY()) == 'P'){
//                p.setX(p.getX()+1);
//            }
//        }
//    }
//    @Override
//    public void moveLeft(){
//        if(p.getX()-1 >= 0){
//            if(map.getValueAt(p.getX()-1, p.getY()) == '0' || map.getValueAt(p.getX()-1, p.getY()) == 'P'){
//                p.setX(p.getX()-1);
//            }
//        }
//    }
//    @Override
//    public void moveUp(){
//        if(p.getY() - 1 >= 0){
//            if(map.getValueAt(p.getX(), p.getY()-1)== '0' || map.getValueAt(p.getX(), p.getY()-1) == 'P'){
//                p.setY(p.getY()-1);
//            }
//        }
//    }
//    @Override
//    public void moveDown(){
//        if(p.getY() + 1 < map.getSize()){
//            if(map.getValueAt(p.getX(), p.getY()+1)== '0' || map.getValueAt(p.getX(), p.getY()+1) == 'P'){
//                p.setY(p.getY()+1);
//            }
//        }
//    }
//    @Override
//    public void setMap(Map map){
//        this.map = map;
//        for(int i = 0; i<map.getSize();i++){
//            for(int j = 0; j <map.getSize();j++){
//                if(map.getValueAt(i, j)=='P'){
//                    p = new Position(i,j);
//                }
//            }
//        }
//    }
//    @Override
//    public Position getPosition(){
//        return p;
//    }
//
//
//
//}
//// END of your code.
///*
//DO NOT MODIFY THIS PART!!!
//Input and Output has been done for you.
//Various conditions are meant to check individual classes separately.
//You still need to implement completely all the necessary classes with their corresponding methods,
//but the correctness for each class is checked individually.
//In other words, you already get some partial points for implementing some classes completely and correctly,
//even if other classes are complete but still may not work properly.
//*/
//public class Solution{
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String className = input.nextLine();
//
//        // Checking the implementation of the Position class
//        if(className.equals("Position")){
//            Position p1 = new Position(input.nextInt(), input.nextInt());
//            System.out.println(p1);
//            p1.setX(5);
//            System.out.println(p1.getX());
//
//            Position p2 = new Position(5, 10);
//            System.out.println(p1.equals(p2));
//        }
//
//        // Checking the implementation of the Map class
//        else if(className.equals("Map")){
//            try{
//                Map map = new Map(input);
//                map.print();
//                int size = map.getSize();
//                System.out.println(size);
//                System.out.println(map.getValueAt(size/2, size/2));
//            }
//            catch(Exception e){}
//        }
//
//        // Checking the Player interface and the MyPlayer class
//        else if(className.equals("Player")){
//            Player player = new MyPlayer();
//            System.out.println(Player.class.isInterface());
//            System.out.println(player instanceof Player);
//            System.out.println(player instanceof MyPlayer);
//        }
//
//        // Checking the InvalidMapException class
//        else if(className.equals("Exception")){
//            try{
//                throw new InvalidMapException("Some message");
//            }
//            catch(InvalidMapException e){
//                System.out.println(e.getMessage());
//            }
//        }
//
//        // Checking the Game class and all of its components
//        else if(className.equals("Game")){
//
//            // Initialize player, map, and the game
//            Player player = new MyPlayer();
//            Game game = null;
//
//            try{
//                game = new Game(new Map(input));
//            }
//            catch(InvalidMapException e){ // custom exception
//                System.out.println(e.getMessage());
//                System.exit(0);
//            }
//
//            game.addPlayer(player);
//
//            // Make the player move based on the commands given in the input
//            String moves = input.next();
//            char move;
//            for(int i=0; i<moves.length(); i++){
//                move = moves.charAt(i);
//                switch(move){
//                    case 'R':
//                        player.moveRight();
//                        break;
//                    case 'L':
//                        player.moveLeft();
//                        break;
//                    case 'U':
//                        player.moveUp();
//                        break;
//                    case 'D':
//                        player.moveDown();
//                        break;
//                }
//            }
//
//            // Determine the final position of the player after completing all the moves above
//            Position playerPosition = player.getPosition();
//            System.out.println("Player final position");
//            System.out.println("Row: " + playerPosition.getY());
//            System.out.println("Col: " + playerPosition.getX());
//        }
//    }
//}