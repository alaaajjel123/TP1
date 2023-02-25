package Problems;

import java.util.ArrayList;
import java.util.List;

public class I_am_All_Alone {
	
	public static boolean allAlone(char[][] house) {
        List<Point> points = new ArrayList<>();
        for (int x = 0; x < house.length; x++) {
            for (int y = 0; y < house[x].length; y++) {
                if (house[x][y] == 'X') {
                    points.add(new Point(x, y));
                }
            }
        }

        while (true) {
            boolean blockAllPoints = true;
            for (int k = 0; k < points.size(); k++) {
                Point p = points.get(k);
                Point up = new Point(p.getx() - 1, p.gety());
                Point down = new Point(p.getx() + 1, p.gety());
                Point right = new Point(p.getx(), p.gety() + 1);
                Point left = new Point(p.getx() - 1, p.gety() - 1);
                if (isFinish(house, up, down, right, left)) {
                    return false;
                }
                if (success(house, points, up, down, right, left)) {
                    blockAllPoints = false;
                }
            }
            if (blockAllPoints) {
                return true;
            }
        }
    }

    private static boolean success(char[][] house, List<Point> points, Point up, Point down, Point right, Point left) {
        return addPoint(house, points, up) ||
                addPoint(house, points, down) ||
                addPoint(house, points, right) ||
                addPoint(house, points, left);
    }

    private static boolean isFinish(char[][] house, Point up, Point down, Point right, Point left) {
        return house[up.getx()][up.gety()] == 'o' ||
                house[down.getx()][down.gety()] == 'o' ||
                house[right.getx()][right.gety()] == 'o' ||
                house[left.getx()][left.gety()] == 'o';
    }

    private static boolean addPoint(char[][] house, List<Point> points, Point point) {
        if (!points.contains(point) && house[point.getx()][point.gety()] != '#') {
            points.add(point);
            return true;
        }
        return false;
    }

}
