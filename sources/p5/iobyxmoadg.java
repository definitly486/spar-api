package p5;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.util.Log;
import hg.agtfadlqog;
import io.appmetrica.analytics.coreutils.internal.services.telephony.CellularNetworkTypeExtractor;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {
    public static final Cursor iobyxmoadg(Cursor c13) {
        zdlpuopuiu.btonecajqb(c13, "c");
        try {
            MatrixCursor matrixCursor = new MatrixCursor(c13.getColumnNames(), c13.getCount());
            while (c13.moveToNext()) {
                Object[] objArr = new Object[c13.getColumnCount()];
                int columnCount = c13.getColumnCount();
                for (int i13 = 0; i13 < columnCount; i13++) {
                    int type = c13.getType(i13);
                    if (type == 0) {
                        objArr[i13] = null;
                    } else if (type == 1) {
                        objArr[i13] = Long.valueOf(c13.getLong(i13));
                    } else if (type == 2) {
                        objArr[i13] = Double.valueOf(c13.getDouble(i13));
                    } else if (type == 3) {
                        objArr[i13] = c13.getString(i13);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i13] = c13.getBlob(i13);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            rg.zoijcleaow.iobyxmoadg(c13, null);
            return matrixCursor;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(c13, th2);
                throw th3;
            }
        }
    }

    public static final int ppxfxbqfkf(Cursor c13, String name) {
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(name, "name");
        int columnIndex = c13.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c13.getColumnIndex('`' + name + '`');
        return columnIndex2 >= 0 ? columnIndex2 : zoijcleaow(c13, name);
    }

    public static final int wkgbmnqykc(Cursor c13, String name) {
        String strWizcaqwiak;
        zdlpuopuiu.btonecajqb(c13, "c");
        zdlpuopuiu.btonecajqb(name, "name");
        int iPpxfxbqfkf = ppxfxbqfkf(c13, name);
        if (iPpxfxbqfkf >= 0) {
            return iPpxfxbqfkf;
        }
        try {
            String[] columnNames = c13.getColumnNames();
            zdlpuopuiu.dxjokdxxww(columnNames, "c.columnNames");
            strWizcaqwiak = agtfadlqog.wizcaqwiak(columnNames, null, null, null, 0, null, null, 63, null);
        } catch (Exception e13) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e13);
            strWizcaqwiak = CellularNetworkTypeExtractor.UNKNOWN_NETWORK_TYPE_VALUE;
        }
        throw new IllegalArgumentException("column '" + name + "' does not exist. Available columns: " + strWizcaqwiak);
    }

    private static final int zoijcleaow(Cursor cursor, String str) {
        return -1;
    }
}
