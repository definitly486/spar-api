package io.appmetrica.analytics.impl;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtilsKt;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.vk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3918vk implements InterfaceC3461dd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final to f48247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f48248b = "startup_state";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AESEncrypter f48249c;

    public C3918vk(to toVar) {
        this.f48247a = toVar;
        C3369a c3369a = new C3369a(Ia.j().f());
        this.f48249c = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, c3369a.b(), c3369a.a());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3461dd
    public final void a(Context context) {
        SQLiteDatabase readableDatabase = C3880u7.a(context).h().getReadableDatabase();
        if (readableDatabase != null) {
            try {
                Vb vbA = a(readableDatabase);
                C3596im c3596im = new C3596im(new G4(new E4()));
                if (vbA != null) {
                    a(this.f48247a, c3596im, vbA);
                    c3596im.f47477p = vbA.f46670c;
                    c3596im.f47479r = vbA.f46669b;
                }
                C3621jm c3621jm = new C3621jm(c3596im);
                Rm rmA = Qm.a(C3621jm.class);
                rmA.a(context, rmA.d(context)).save(c3621jm);
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(to toVar, C3596im c3596im, Vb vb3) {
        String strOptStringOrNull;
        synchronized (toVar) {
            strOptStringOrNull = JsonUtils.optStringOrNull(toVar.f48151a.a(), "device_id");
        }
        if (TextUtils.isEmpty(strOptStringOrNull)) {
            if (!TextUtils.isEmpty(vb3.f46671d)) {
                toVar.a(vb3.f46671d);
            }
            if (!TextUtils.isEmpty(vb3.f46672e)) {
                toVar.b(vb3.f46672e);
            }
            if (TextUtils.isEmpty(vb3.f46668a)) {
                return;
            }
            c3596im.f47462a = vb3.f46668a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0047 A[Catch: all -> 0x004c, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x004c, blocks: (B:5:0x001b, B:7:0x0022, B:9:0x0028, B:13:0x0047), top: B:21:0x001b }] */
    public final Vb a(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery;
        try {
            cursorQuery = sQLiteDatabase.query("binary_data", new String[]{"value"}, "data_key = ?", new String[]{this.f48248b}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() == 1 && cursorQuery.moveToFirst()) {
                        Vb vb3 = (Vb) MessageNano.mergeFrom(new Vb(), this.f48249c.decrypt(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("value"))));
                        CloseableUtilsKt.closeSafely(cursorQuery);
                        return vb3;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.getCount();
                    }
                } catch (Throwable unused) {
                }
            } else if (cursorQuery != null) {
                cursorQuery.getCount();
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        CloseableUtilsKt.closeSafely(cursorQuery);
        return null;
    }
}
