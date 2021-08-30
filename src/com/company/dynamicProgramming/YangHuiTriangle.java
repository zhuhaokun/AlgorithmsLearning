package com.company.dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class YangHuiTriangle {
    public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> res = new ArrayList<>();
            if (numRows == 1) {
                res.add(Arrays.asList(1));
                return res;
            } else if (numRows == 2) {
                res.add(Arrays.asList(1));
                res.add(Arrays.asList(1, 1));
                return res;
            } else {
                res.add(Arrays.asList(1));
                res.add(Arrays.asList(1, 1));
                List<Integer> lastList = res.get(res.size() - 1);
                for (int i = 3; i <= numRows; i++) {
                    List<Integer> curList = new ArrayList<>();
                    curList.add(1);
                    for (int j = 0; j < lastList.size() - 1; j++) {
                        curList.add(lastList.get(j) + lastList.get(j + 1));
                    }
                    curList.add(1);
                    res.add(curList);
                    lastList = curList;
                }
            }

            return res;
    }
}
