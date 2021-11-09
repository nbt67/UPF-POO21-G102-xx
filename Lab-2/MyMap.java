import java.util.LinkedList;

public class MyMap extends javax.swing.JPanel {

    private World myworld;

    public MyMap() {
        initComponents();

        //Points
        LinkedList< Point > points1 = new LinkedList< Point >();
        points1.add( new Point( 10.0, 100.0 , "hexagonPoint1") );
        points1.add( new Point( 150.0, 10.0 , "hexagonPoint2") );
        points1.add( new Point( 290.0, 100.0 , "hexagonPoint3") );
        points1.add( new Point( 290.0, 200.0 , "hexagonPoint4") );
        points1.add( new Point( 150.0, 290.0 , "hexagonPoint5") );
        points1.add( new Point( 10.0, 200.0 , "hexagonPoint6") );

        LinkedList< Point > points2 = new LinkedList< Point >();
        points2.add( new Point( 20.0, 200.0 , "hexagon2Point1") );
        points2.add( new Point( 300.0, 20.0 , "hexagon2Point2") );
        points2.add( new Point( 580.0, 200.0 , "hexagon2Point3") );
        points2.add( new Point( 580.0, 400.0 , "hexagon2Point4") );
        points2.add( new Point( 300.0, 580.0 , "hexagon2Point5") );
        points2.add( new Point( 20.0, 400.0 , "hexagon2Point6") );

        LinkedList< Point > points3 = new LinkedList< Point >();
        points3.add( new Point( 300.0, 400.0 , "squarePoint1") );
        points3.add( new Point( 300.0, 500.0 , "squarePoint2") );
        points3.add( new Point( 400.0, 500.0 , "squarePoint3") );
        points3.add( new Point( 400.0, 400.0 , "squarePoint4") );

        LinkedList< Point > points4 = new LinkedList< Point >();
        points4.add( new Point( 10.0, 100.0 , "square2Point1") );
        points4.add( new Point( 60.0, 100.0 , "square2Point2") );
        points4.add( new Point( 60.0, 160.0 , "square2Point3") );
        points4.add( new Point( 10.0, 160.0 , "square2Point4") );

        //PolygonalRegions
        LinkedList< PolygonalRegion > polygonalRegions1 = new LinkedList< PolygonalRegion >();
        polygonalRegions1.add(new PolygonalRegion(points1));
        polygonalRegions1.add(new PolygonalRegion(points2));

        LinkedList< PolygonalRegion > polygonalRegions2 = new LinkedList< PolygonalRegion >();
        polygonalRegions2.add(new PolygonalRegion(points3));
        polygonalRegions2.add(new PolygonalRegion(points4));

        //Continents
        LinkedList< Continent > myContinents = new LinkedList< Continent >();
        myContinents.add(new Continent(polygonalRegions1));
        myContinents.add(new Continent(polygonalRegions2));

        myContinents.get(0).getTotalArea();
        myContinents.get(1).getTotalArea();

        //World
        myworld = new World( myContinents );
    }

    private void initComponents() {
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
    }

    public void paint( java.awt.Graphics g ) {
        super.paint( g );
        myworld.draw( g , 1000, 1000);
    }      
}