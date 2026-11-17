package nb2;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class kcexrzcfyt {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final agtfadlqog f69581iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final oxmwwwfdhm f69582zoijcleaow;

    public kcexrzcfyt(agtfadlqog persistentMetricsEventRepository, oxmwwwfdhm remoteMetricsEventRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventRepository, "persistentMetricsEventRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(remoteMetricsEventRepository, "remoteMetricsEventRepository");
        this.f69581iobyxmoadg = persistentMetricsEventRepository;
        this.f69582zoijcleaow = remoteMetricsEventRepository;
    }

    public final jyumaefscl iobyxmoadg() throws JSONException {
        String str;
        String strIobyxmoadg;
        agtfadlqog agtfadlqogVar = this.f69581iobyxmoadg;
        dxjokdxxww dxjokdxxwwVar = agtfadlqogVar.f69544iobyxmoadg;
        dxjokdxxwwVar.getClass();
        String strBtonecajqb = mj.kcexrzcfyt.btonecajqb("\n            SELECT * FROM metrics_event_table\n            LIMIT 10\n        ");
        ArrayList arrayList = new ArrayList();
        Cursor cursorRawQuery = ((SQLiteDatabase) dxjokdxxwwVar.f69556ppxfxbqfkf.getValue()).rawQuery(strBtonecajqb, new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                String value = cursorRawQuery.getString(columnIndexOrThrow);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(value, "cursor.getString(uuidColumnIndex)");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                arrayList.add(new btonecajqb(value, blob));
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            rg.zoijcleaow.iobyxmoadg(cursorRawQuery, null);
            List<btonecajqb> listM = hg.jyumaefscl.m(arrayList);
            dxjokdxxwwVar.f69557zoijcleaow.iobyxmoadg(new nufgyqmvbu(listM));
            draadjrbmk draadjrbmkVar = agtfadlqogVar.f69545ppxfxbqfkf;
            ArrayList<wkgbmnqykc> values = new ArrayList(hg.jyumaefscl.cqumvgiudr(listM, 10));
            for (btonecajqb dto : listM) {
                draadjrbmkVar.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dto, "dto");
                String str2 = dto.f69548iobyxmoadg;
                vipkmwdibw vipkmwdibwVar = draadjrbmkVar.f69553iobyxmoadg;
                String jsonString = mj.kcexrzcfyt.esjtqupxsv(dto.f69549zoijcleaow);
                vipkmwdibwVar.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jsonString, "jsonString");
                JSONObject jSONObject = new JSONObject(jsonString);
                String string = jSONObject.getString(ExternalMetricsManagerImpl.NAME);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "jsonObject.getString(NAME_KEY)");
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(jSONObject2, "jsonObject.getJSONObject(DATA_KEY)");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(jSONObject2, "<this>");
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> itKeys = jSONObject2.keys();
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(itKeys, "keys()");
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList2.add(gg.cqumvgiudr.iobyxmoadg(next, jSONObject2.get(next).toString()));
                }
                values.add(new wkgbmnqykc(str2, new mb2.ppxfxbqfkf(string, hg.tzroggbefp.kcexrzcfyt(arrayList2), jSONObject.getLong("time"))));
            }
            if (values.isEmpty()) {
                return jyumaefscl.iobyxmoadg.f69579iobyxmoadg;
            }
            oxmwwwfdhm oxmwwwfdhmVar = this.f69582zoijcleaow;
            oxmwwwfdhmVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
            String value2 = oxmwwwfdhmVar.f69601zoijcleaow.f69602iobyxmoadg.getPackageName();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(value2, "context.packageName");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value2, "value");
            istkbnxepw istkbnxepwVar = oxmwwwfdhmVar.f69598iobyxmoadg;
            SharedPreferences sharedPreferences = istkbnxepwVar.f69570iobyxmoadg.f69551iobyxmoadg;
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferences, "sharedPreferences");
            String value3 = sharedPreferences.getString("USER_ID_KEY", null);
            if (value3 != null) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value3, "value");
            } else {
                value3 = null;
            }
            if (value3 == null) {
                synchronized (istkbnxepw.f69569ppxfxbqfkf) {
                    try {
                        SharedPreferences sharedPreferences2 = istkbnxepwVar.f69570iobyxmoadg.f69551iobyxmoadg;
                        kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(sharedPreferences2, "sharedPreferences");
                        String value4 = sharedPreferences2.getString("USER_ID_KEY", null);
                        if (value4 != null) {
                            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value4, "value");
                        } else {
                            value4 = null;
                        }
                        strIobyxmoadg = value4 == null ? istkbnxepwVar.iobyxmoadg() : value4;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                str = strIobyxmoadg;
            } else {
                str = value3;
            }
            lmojexxdyd lmojexxdydVar = (lmojexxdyd) oxmwwwfdhmVar.f69600wkgbmnqykc.f69631zoijcleaow.getValue();
            String str3 = lmojexxdydVar != null ? lmojexxdydVar.f69585iobyxmoadg : null;
            ArrayList values2 = new ArrayList(hg.jyumaefscl.cqumvgiudr(values, 10));
            for (wkgbmnqykc wkgbmnqykcVar : values) {
                values2.add(new rgvfuqvkyq(value2, wkgbmnqykcVar.f69620iobyxmoadg, str, str3, wkgbmnqykcVar.f69621zoijcleaow));
            }
            ojitshcjhn ojitshcjhnVar = oxmwwwfdhmVar.f69599ppxfxbqfkf;
            ojitshcjhnVar.getClass();
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values2, "values");
            ojitshcjhnVar.f69597iobyxmoadg.eablkybsjg(values2);
            return new jyumaefscl.zoijcleaow(values);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                rg.zoijcleaow.iobyxmoadg(cursorRawQuery, th3);
                throw th4;
            }
        }
    }
}
