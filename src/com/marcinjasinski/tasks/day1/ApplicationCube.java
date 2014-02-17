package com.marcinjasinski.tasks.day1;

import com.marcinjasinski.tasks.day1.util.Cube;

/**
 * @author Marcin Jasinski <mkjasinski@gmail.com>
 */
public class ApplicationCube {
    /**
     * @param args args params
     */
    public static void main(String[] args) {

        int min = Integer.parseInt(args[1]);
        int max = Integer.parseInt(args[2]);
        int range = Integer.parseInt(args[0]);

        assert min > 0;
        assert max > 0 && max > min;
        assert range > 0;

        Cube cube = new Cube(min, max);

        for (int i = 0; i < range; i++) {
            System.out.format(
                    "min: %d, max: %d, result: %d\n",
                    cube.getMin(),
                    cube.getMax(),
                    cube.getRandomInt()
            );
        }
    }
}
