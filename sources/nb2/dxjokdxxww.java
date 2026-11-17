package nb2;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import ru.rustore.sdk.metrics.MetricsException;

/* JADX INFO: loaded from: classes6.dex */
public final class dxjokdxxww {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ntlheqmsrt f69555iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public final gg.gtknphoqwx f69556ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final hkdspvbjdz f69557zoijcleaow;

    public static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final /* synthetic */ String f69558zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public iobyxmoadg(String str) {
            super(0);
            this.f69558zdlpuopuiu = str;
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            return this.f69558zdlpuopuiu;
        }
    }

    public static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        public final /* synthetic */ btonecajqb f69559zdlpuopuiu;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public zoijcleaow(btonecajqb btonecajqbVar) {
            super(0);
            this.f69559zdlpuopuiu = btonecajqbVar;
        }

        @Override // tg.iobyxmoadg
        public final Object invoke() {
            StringBuilder sb3 = new StringBuilder("Create row in storage ");
            sb3.append((Object) ("MetricsEventUuid(value=" + this.f69559zdlpuopuiu.f69548iobyxmoadg + ')'));
            return sb3.toString();
        }
    }

    public dxjokdxxww(ntlheqmsrt metricsEventDataBaseHelper, iwizpuwonk.zoijcleaow logger) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricsEventDataBaseHelper, "metricsEventDataBaseHelper");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(logger, "logger");
        this.f69555iobyxmoadg = metricsEventDataBaseHelper;
        this.f69557zoijcleaow = logger;
        this.f69556ppxfxbqfkf = gg.draadjrbmk.zoijcleaow(new eablkybsjg(this));
    }

    public final void iobyxmoadg(ArrayList persistentMetricsEventsDto) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventsDto, "persistentMetricsEventsDto");
        String strIwxlajgraz = hg.jyumaefscl.iwxlajgraz(persistentMetricsEventsDto, null, null, null, 0, null, lqeggnwhkg.f69586zdlpuopuiu, 31, null);
        String strBtonecajqb = mj.kcexrzcfyt.btonecajqb("\n            DELETE FROM metrics_event_table\n            WHERE _id IN (\n                SELECT _id FROM metrics_event_table\n                WHERE uuid IN (" + strIwxlajgraz + ")\n            )\n        ");
        try {
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).beginTransactionNonExclusive();
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).execSQL(strBtonecajqb);
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).endTransaction();
            this.f69557zoijcleaow.iobyxmoadg(new gxszxtbevo(strIwxlajgraz));
        } catch (Throwable th2) {
            try {
                throw new MetricsException.MetricsDbError("Interaction with database failed", th2);
            } catch (Throwable th3) {
                ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).endTransaction();
                throw th3;
            }
        }
    }

    public final void zoijcleaow(btonecajqb persistentMetricsEventDto) throws MetricsException.SaveMetricsEventError {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(persistentMetricsEventDto, "persistentMetricsEventDto");
        ContentValues contentValues = new ContentValues();
        contentValues.put(CommonUrlParts.UUID, persistentMetricsEventDto.f69548iobyxmoadg);
        contentValues.put("metrics_event", persistentMetricsEventDto.f69549zoijcleaow);
        try {
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).beginTransactionNonExclusive();
            long jInsert = ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).insert("metrics_event_table", null, contentValues);
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).setTransactionSuccessful();
            ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).endTransaction();
            if (jInsert != -1) {
                this.f69557zoijcleaow.iobyxmoadg(new zoijcleaow(persistentMetricsEventDto));
                return;
            }
            StringBuilder sb3 = new StringBuilder("Saving error ");
            sb3.append((Object) ("MetricsEventUuid(value=" + persistentMetricsEventDto.f69548iobyxmoadg + ')'));
            String string = sb3.toString();
            this.f69557zoijcleaow.iobyxmoadg(new iobyxmoadg(string));
            throw new MetricsException.SaveMetricsEventError(string);
        } catch (Throwable th2) {
            try {
                throw new MetricsException.MetricsDbError("Interaction with database failed", th2);
            } catch (Throwable th3) {
                ((SQLiteDatabase) this.f69556ppxfxbqfkf.getValue()).endTransaction();
                throw th3;
            }
        }
    }
}
