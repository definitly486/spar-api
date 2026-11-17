package nb2;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Map;
import modern.payments.ecomAndroid.util.externalMetrics.ExternalMetricsManagerImpl;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final okpsazkaxt f69636iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final metgxyhuhe f69637ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final nb2.iobyxmoadg f69638wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final jztzpxfvev f69639zoijcleaow;

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public static final iobyxmoadg f69640zdlpuopuiu = new iobyxmoadg();

        public iobyxmoadg() {
            super(1);
        }

        @Override // tg.draadjrbmk
        public final Object invoke(Object obj) {
            String it = (String) obj;
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
            return "'" + it + '\'';
        }
    }

    public zoijcleaow(okpsazkaxt migrationDtoVer1Factory, jztzpxfvev migrationDtoVer1Serializer, metgxyhuhe migrationDtoVer2Mapper, nb2.iobyxmoadg migrationDtoVer2Serializer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrationDtoVer1Factory, "migrationDtoVer1Factory");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrationDtoVer1Serializer, "migrationDtoVer1Serializer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrationDtoVer2Mapper, "migrationDtoVer2Mapper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(migrationDtoVer2Serializer, "migrationDtoVer2Serializer");
        this.f69636iobyxmoadg = migrationDtoVer1Factory;
        this.f69639zoijcleaow = migrationDtoVer1Serializer;
        this.f69637ppxfxbqfkf = migrationDtoVer2Mapper;
        this.f69638wkgbmnqykc = migrationDtoVer2Serializer;
    }

    public final void iobyxmoadg(SQLiteDatabase db3) throws JSONException {
        zoijcleaow zoijcleaowVar = this;
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
        ArrayList<ikoacuggdj> arrayList = new ArrayList();
        int i13 = 0;
        Cursor cursorRawQuery = db3.rawQuery("\n                SELECT * FROM metrics_event_table\n                ", new String[0]);
        try {
            int columnIndexOrThrow = cursorRawQuery.getColumnIndexOrThrow(CommonUrlParts.UUID);
            int columnIndexOrThrow2 = cursorRawQuery.getColumnIndexOrThrow("metrics_event");
            while (cursorRawQuery.moveToNext()) {
                okpsazkaxt okpsazkaxtVar = zoijcleaowVar.f69636iobyxmoadg;
                String value = cursorRawQuery.getString(columnIndexOrThrow);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(value, "cursor.getString(uuidColumnIndex)");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
                byte[] blob = cursorRawQuery.getBlob(columnIndexOrThrow2);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(blob, "cursor.getBlob(serializedMetricsEventColumnIndex)");
                String strEsjtqupxsv = mj.kcexrzcfyt.esjtqupxsv(blob);
                okpsazkaxtVar.getClass();
                arrayList.add(okpsazkaxt.iobyxmoadg(value, strEsjtqupxsv));
            }
            gg.wwaezpbzkn wwaezpbzknVar = gg.wwaezpbzkn.f37140iobyxmoadg;
            rg.zoijcleaow.iobyxmoadg(cursorRawQuery, null);
            if (arrayList.isEmpty()) {
                return;
            }
            StringBuilder sb3 = new StringBuilder("\n                UPDATE metrics_event_table\n                SET metrics_event = CASE\n             ");
            ArrayList arrayList2 = new ArrayList();
            for (ikoacuggdj dto : arrayList) {
                metgxyhuhe metgxyhuheVar = zoijcleaowVar.f69637ppxfxbqfkf;
                metgxyhuheVar.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dto, "dto");
                String str = dto.f69565iobyxmoadg;
                String str2 = dto.f69567zoijcleaow;
                Map map = dto.f69566ppxfxbqfkf;
                metgxyhuheVar.f69593iobyxmoadg.getClass();
                xrmfcynszj dto2 = new xrmfcynszj(str, str2, map, System.currentTimeMillis());
                zoijcleaowVar.f69639zoijcleaow.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dto, "dto");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ExternalMetricsManagerImpl.NAME, dto.f69567zoijcleaow);
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry entry : dto.f69566ppxfxbqfkf.entrySet()) {
                    jSONObject2.put((String) entry.getKey(), (String) entry.getValue());
                }
                jSONObject.put("data", jSONObject2);
                String string = jSONObject.toString(i13);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string, "jsonObject.toString(0)");
                byte[] bytes = string.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes, "this as java.lang.String).getBytes(charset)");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes, "<this>");
                String strLxfrhoxuzk = hg.agtfadlqog.lxfrhoxuzk(bytes, "", null, null, 0, null, zynmafqrjb.f69641zdlpuopuiu, 30, null);
                zoijcleaowVar.f69638wkgbmnqykc.getClass();
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(dto2, "dto");
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ExternalMetricsManagerImpl.NAME, dto2.f69627zoijcleaow);
                JSONObject jSONObject4 = new JSONObject();
                for (Map.Entry entry2 : dto2.f69625ppxfxbqfkf.entrySet()) {
                    jSONObject4.put((String) entry2.getKey(), (String) entry2.getValue());
                }
                jSONObject3.put("data", jSONObject4);
                jSONObject3.put("time", dto2.f69626wkgbmnqykc);
                String string2 = jSONObject3.toString(0);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string2, "jsonObject.toString(0)");
                byte[] bytes2 = string2.getBytes(mj.wkgbmnqykc.f67326zoijcleaow);
                kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(bytes2, "this as java.lang.String).getBytes(charset)");
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bytes2, "<this>");
                String str3 = "\n                WHEN metrics_event = x'" + strLxfrhoxuzk + "' THEN x'" + hg.agtfadlqog.lxfrhoxuzk(bytes2, "", null, null, 0, null, zynmafqrjb.f69641zdlpuopuiu, 30, null) + "'\n            ";
                arrayList2.add(dto.f69565iobyxmoadg);
                sb3.append(str3);
                i13 = 0;
                zoijcleaowVar = this;
            }
            sb3.append("\n                END\n                WHERE uuid IN (" + hg.jyumaefscl.iwxlajgraz(arrayList2, null, null, null, 0, null, iobyxmoadg.f69640zdlpuopuiu, 31, null) + ")\n            ");
            String string3 = sb3.toString();
            kotlin.jvm.internal.zdlpuopuiu.dxjokdxxww(string3, "updateQuery.toString()");
            db3.execSQL(mj.kcexrzcfyt.btonecajqb(string3));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                rg.zoijcleaow.iobyxmoadg(cursorRawQuery, th2);
                throw th3;
            }
        }
    }
}
