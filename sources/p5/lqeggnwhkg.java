package p5;

import android.database.Cursor;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import hg.ikoacuggdj;
import hg.jyumaefscl;
import hg.tzroggbefp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.jvm.internal.zdlpuopuiu;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lqeggnwhkg {
    private static final Set eablkybsjg(u5.lqeggnwhkg lqeggnwhkgVar, String str) {
        Cursor cursorE = lqeggnwhkgVar.E("PRAGMA index_list(`" + str + "`)");
        try {
            int columnIndex = cursorE.getColumnIndex(ExternalMetricsManagerImpl.NAME);
            int columnIndex2 = cursorE.getColumnIndex(ClientData.KEY_ORIGIN);
            int columnIndex3 = cursorE.getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                Set setZoijcleaow = ikoacuggdj.zoijcleaow();
                while (cursorE.moveToNext()) {
                    if (zdlpuopuiu.eablkybsjg("c", cursorE.getString(columnIndex2))) {
                        String name = cursorE.getString(columnIndex);
                        boolean z13 = true;
                        if (cursorE.getInt(columnIndex3) != 1) {
                            z13 = false;
                        }
                        zdlpuopuiu.dxjokdxxww(name, "name");
                        gxszxtbevo.eablkybsjg eablkybsjgVarWkgbmnqykc = wkgbmnqykc(lqeggnwhkgVar, name, z13);
                        if (eablkybsjgVarWkgbmnqykc == null) {
                            rg.zoijcleaow.iobyxmoadg(cursorE, null);
                            return null;
                        }
                        setZoijcleaow.add(eablkybsjgVarWkgbmnqykc);
                    }
                }
                Set setIobyxmoadg = ikoacuggdj.iobyxmoadg(setZoijcleaow);
                rg.zoijcleaow.iobyxmoadg(cursorE, null);
                return setIobyxmoadg;
            }
            rg.zoijcleaow.iobyxmoadg(cursorE, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                throw th3;
            }
        }
    }

    public static final gxszxtbevo gxszxtbevo(u5.lqeggnwhkg database, String tableName) {
        zdlpuopuiu.btonecajqb(database, "database");
        zdlpuopuiu.btonecajqb(tableName, "tableName");
        return new gxszxtbevo(tableName, iobyxmoadg(database, tableName), ppxfxbqfkf(database, tableName), eablkybsjg(database, tableName));
    }

    private static final Map iobyxmoadg(u5.lqeggnwhkg lqeggnwhkgVar, String str) {
        Cursor cursorE = lqeggnwhkgVar.E("PRAGMA table_info(`" + str + "`)");
        try {
            if (cursorE.getColumnCount() <= 0) {
                Map mapDxjokdxxww = tzroggbefp.dxjokdxxww();
                rg.zoijcleaow.iobyxmoadg(cursorE, null);
                return mapDxjokdxxww;
            }
            int columnIndex = cursorE.getColumnIndex(ExternalMetricsManagerImpl.NAME);
            int columnIndex2 = cursorE.getColumnIndex("type");
            int columnIndex3 = cursorE.getColumnIndex("notnull");
            int columnIndex4 = cursorE.getColumnIndex("pk");
            int columnIndex5 = cursorE.getColumnIndex("dflt_value");
            Map mapPpxfxbqfkf = tzroggbefp.ppxfxbqfkf();
            while (cursorE.moveToNext()) {
                String name = cursorE.getString(columnIndex);
                String type = cursorE.getString(columnIndex2);
                boolean z13 = cursorE.getInt(columnIndex3) != 0;
                int i13 = cursorE.getInt(columnIndex4);
                String string = cursorE.getString(columnIndex5);
                zdlpuopuiu.dxjokdxxww(name, "name");
                zdlpuopuiu.dxjokdxxww(type, "type");
                mapPpxfxbqfkf.put(name, new gxszxtbevo.iobyxmoadg(name, type, z13, i13, string, 2));
            }
            Map mapZoijcleaow = tzroggbefp.zoijcleaow(mapPpxfxbqfkf);
            rg.zoijcleaow.iobyxmoadg(cursorE, null);
            return mapZoijcleaow;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                throw th3;
            }
        }
    }

    private static final Set ppxfxbqfkf(u5.lqeggnwhkg lqeggnwhkgVar, String str) {
        Cursor cursorE = lqeggnwhkgVar.E("PRAGMA foreign_key_list(`" + str + "`)");
        try {
            int columnIndex = cursorE.getColumnIndex("id");
            int columnIndex2 = cursorE.getColumnIndex("seq");
            int columnIndex3 = cursorE.getColumnIndex("table");
            int columnIndex4 = cursorE.getColumnIndex("on_delete");
            int columnIndex5 = cursorE.getColumnIndex("on_update");
            List listZoijcleaow = zoijcleaow(cursorE);
            cursorE.moveToPosition(-1);
            Set setZoijcleaow = ikoacuggdj.zoijcleaow();
            while (cursorE.moveToNext()) {
                if (cursorE.getInt(columnIndex2) == 0) {
                    int i13 = cursorE.getInt(columnIndex);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList<gxszxtbevo.wkgbmnqykc> arrayList3 = new ArrayList();
                    for (Object obj : listZoijcleaow) {
                        if (((gxszxtbevo.wkgbmnqykc) obj).ppxfxbqfkf() == i13) {
                            arrayList3.add(obj);
                        }
                    }
                    for (gxszxtbevo.wkgbmnqykc wkgbmnqykcVar : arrayList3) {
                        arrayList.add(wkgbmnqykcVar.zoijcleaow());
                        arrayList2.add(wkgbmnqykcVar.wkgbmnqykc());
                    }
                    String string = cursorE.getString(columnIndex3);
                    zdlpuopuiu.dxjokdxxww(string, "cursor.getString(tableColumnIndex)");
                    String string2 = cursorE.getString(columnIndex4);
                    zdlpuopuiu.dxjokdxxww(string2, "cursor.getString(onDeleteColumnIndex)");
                    String string3 = cursorE.getString(columnIndex5);
                    zdlpuopuiu.dxjokdxxww(string3, "cursor.getString(onUpdateColumnIndex)");
                    setZoijcleaow.add(new gxszxtbevo.ppxfxbqfkf(string, string2, string3, arrayList, arrayList2));
                }
            }
            Set setIobyxmoadg = ikoacuggdj.iobyxmoadg(setZoijcleaow);
            rg.zoijcleaow.iobyxmoadg(cursorE, null);
            return setIobyxmoadg;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                throw th3;
            }
        }
    }

    private static final gxszxtbevo.eablkybsjg wkgbmnqykc(u5.lqeggnwhkg lqeggnwhkgVar, String str, boolean z13) {
        Cursor cursorE = lqeggnwhkgVar.E("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = cursorE.getColumnIndex("seqno");
            int columnIndex2 = cursorE.getColumnIndex("cid");
            int columnIndex3 = cursorE.getColumnIndex(ExternalMetricsManagerImpl.NAME);
            int columnIndex4 = cursorE.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (cursorE.moveToNext()) {
                    if (cursorE.getInt(columnIndex2) >= 0) {
                        int i13 = cursorE.getInt(columnIndex);
                        String columnName = cursorE.getString(columnIndex3);
                        String str2 = cursorE.getInt(columnIndex4) > 0 ? "DESC" : "ASC";
                        Integer numValueOf = Integer.valueOf(i13);
                        zdlpuopuiu.dxjokdxxww(columnName, "columnName");
                        treeMap.put(numValueOf, columnName);
                        treeMap2.put(Integer.valueOf(i13), str2);
                    }
                }
                Collection collectionValues = treeMap.values();
                zdlpuopuiu.dxjokdxxww(collectionValues, "columnsMap.values");
                List listM = jyumaefscl.m(collectionValues);
                Collection collectionValues2 = treeMap2.values();
                zdlpuopuiu.dxjokdxxww(collectionValues2, "ordersMap.values");
                gxszxtbevo.eablkybsjg eablkybsjgVar = new gxszxtbevo.eablkybsjg(str, z13, listM, jyumaefscl.m(collectionValues2));
                rg.zoijcleaow.iobyxmoadg(cursorE, null);
                return eablkybsjgVar;
            }
            rg.zoijcleaow.iobyxmoadg(cursorE, null);
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(cursorE, th2);
                throw th3;
            }
        }
    }

    private static final List zoijcleaow(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        List listPpxfxbqfkf = jyumaefscl.ppxfxbqfkf();
        while (cursor.moveToNext()) {
            int i13 = cursor.getInt(columnIndex);
            int i14 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            zdlpuopuiu.dxjokdxxww(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            zdlpuopuiu.dxjokdxxww(string2, "cursor.getString(toColumnIndex)");
            listPpxfxbqfkf.add(new gxszxtbevo.wkgbmnqykc(i13, i14, string, string2));
        }
        return jyumaefscl.b(jyumaefscl.iobyxmoadg(listPpxfxbqfkf));
    }
}
