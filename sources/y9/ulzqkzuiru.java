package y9;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class ulzqkzuiru extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
    private static final iobyxmoadg f124153cdpycssgdh;

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private static final iobyxmoadg f124154cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private static final iobyxmoadg f124155esjtqupxsv;

    /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
    private static final iobyxmoadg f124156istkbnxepw;

    /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
    private static final iobyxmoadg f124159lereixgezr;

    /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
    private static final iobyxmoadg f124160pmvmpeiblj;

    /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
    private static final List f124161yadqdtsiqt;

    /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
    private static final iobyxmoadg f124162zynmafqrjb;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private boolean f124163yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final int f124164zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final String f124158jyumaefscl = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    static int f124157iwizpuwonk = 7;

    public interface iobyxmoadg {
        void iobyxmoadg(SQLiteDatabase sQLiteDatabase);
    }

    static {
        iobyxmoadg iobyxmoadgVar = new iobyxmoadg() { // from class: y9.dsvhmnatus
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                ulzqkzuiru.ojitshcjhn(sQLiteDatabase);
            }
        };
        f124154cqumvgiudr = iobyxmoadgVar;
        iobyxmoadg iobyxmoadgVar2 = new iobyxmoadg() { // from class: y9.wypolnanlu
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                ulzqkzuiru.rgvfuqvkyq(sQLiteDatabase);
            }
        };
        f124155esjtqupxsv = iobyxmoadgVar2;
        iobyxmoadg iobyxmoadgVar3 = new iobyxmoadg() { // from class: y9.stevsuqkhv
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f124159lereixgezr = iobyxmoadgVar3;
        iobyxmoadg iobyxmoadgVar4 = new iobyxmoadg() { // from class: y9.kegysxyocb
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                ulzqkzuiru.kcexrzcfyt(sQLiteDatabase);
            }
        };
        f124160pmvmpeiblj = iobyxmoadgVar4;
        iobyxmoadg iobyxmoadgVar5 = new iobyxmoadg() { // from class: y9.tzroggbefp
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                ulzqkzuiru.zdlpuopuiu(sQLiteDatabase);
            }
        };
        f124162zynmafqrjb = iobyxmoadgVar5;
        iobyxmoadg iobyxmoadgVar6 = new iobyxmoadg() { // from class: y9.mbcevpiqjq
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f124156istkbnxepw = iobyxmoadgVar6;
        iobyxmoadg iobyxmoadgVar7 = new iobyxmoadg() { // from class: y9.ntlheqmsrt
            @Override // y9.ulzqkzuiru.iobyxmoadg
            public final void iobyxmoadg(SQLiteDatabase sQLiteDatabase) {
                ulzqkzuiru.cqumvgiudr(sQLiteDatabase);
            }
        };
        f124153cdpycssgdh = iobyxmoadgVar7;
        f124161yadqdtsiqt = Arrays.asList(iobyxmoadgVar, iobyxmoadgVar2, iobyxmoadgVar3, iobyxmoadgVar4, iobyxmoadgVar5, iobyxmoadgVar6, iobyxmoadgVar7);
    }

    ulzqkzuiru(Context context, String str, int i13) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i13);
        this.f124163yggfygwlhe = false;
        this.f124164zdlpuopuiu = i13;
    }

    private void agtfadlqog(SQLiteDatabase sQLiteDatabase) {
        if (this.f124163yggfygwlhe) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void cqumvgiudr(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void kcexrzcfyt(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    private void lereixgezr(SQLiteDatabase sQLiteDatabase, int i13) {
        agtfadlqog(sQLiteDatabase);
        pmvmpeiblj(sQLiteDatabase, 0, i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ojitshcjhn(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    private void pmvmpeiblj(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        List list = f124161yadqdtsiqt;
        if (i14 <= list.size()) {
            while (i13 < i14) {
                ((iobyxmoadg) f124161yadqdtsiqt.get(i13)).iobyxmoadg(sQLiteDatabase);
                i13++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i13 + " to " + i14 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void rgvfuqvkyq(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void zdlpuopuiu(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f124158jyumaefscl);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f124163yggfygwlhe = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        lereixgezr(sQLiteDatabase, this.f124164zdlpuopuiu);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        lereixgezr(sQLiteDatabase, i14);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        agtfadlqog(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i13, int i14) {
        agtfadlqog(sQLiteDatabase);
        pmvmpeiblj(sQLiteDatabase, i13, i14);
    }
}
