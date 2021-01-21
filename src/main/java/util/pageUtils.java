package util;

import java.util.List;

/**
 * @author sxwstart
 * @create 2020-12-30-16:21:58
 */
public class pageUtils {
    private static final long serialVersionUID=1L;
    private int total;
    private List<?> rows;

    public pageUtils(List<?> rows,int total ) {
        this.total = total;
        this.rows = rows;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "pageUtils{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
