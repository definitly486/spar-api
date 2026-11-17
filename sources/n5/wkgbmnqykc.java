package n5;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import gg.wwaezpbzkn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class wkgbmnqykc implements u5.nufgyqmvbu, nufgyqmvbu {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final iobyxmoadg f68900jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final n5.ppxfxbqfkf f68901yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final u5.nufgyqmvbu f68902zdlpuopuiu;

    public static final class iobyxmoadg implements u5.lqeggnwhkg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final n5.ppxfxbqfkf f68903zdlpuopuiu;

        static final class eablkybsjg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final eablkybsjg f68904zdlpuopuiu = new eablkybsjg();

            eablkybsjg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(u5.lqeggnwhkg db3) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
                return Boolean.valueOf(db3.d0());
            }
        }

        static final class gxszxtbevo extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final gxszxtbevo f68905zdlpuopuiu = new gxszxtbevo();

            gxszxtbevo() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final String invoke(u5.lqeggnwhkg obj) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(obj, "obj");
                return obj.gxszxtbevo();
            }
        }

        /* JADX INFO: renamed from: n5.wkgbmnqykc$iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
        static final class C1480iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C1480iobyxmoadg f68906zdlpuopuiu = new C1480iobyxmoadg();

            C1480iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final List invoke(u5.lqeggnwhkg obj) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(obj, "obj");
                return obj.yadqdtsiqt();
            }
        }

        static final class lqeggnwhkg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final lqeggnwhkg f68907zdlpuopuiu = new lqeggnwhkg();

            lqeggnwhkg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u5.lqeggnwhkg it) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(it, "it");
                return null;
            }
        }

        static final class nufgyqmvbu extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
            final /* synthetic */ Object[] f68908cqumvgiudr;

            /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
            final /* synthetic */ String f68909iwizpuwonk;

            /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
            final /* synthetic */ ContentValues f68910jyumaefscl;

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ int f68911yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ String f68912zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            nufgyqmvbu(String str, int i13, ContentValues contentValues, String str2, Object[] objArr) {
                super(1);
                this.f68912zdlpuopuiu = str;
                this.f68911yggfygwlhe = i13;
                this.f68910jyumaefscl = contentValues;
                this.f68909iwizpuwonk = str2;
                this.f68908cqumvgiudr = objArr;
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(u5.lqeggnwhkg db3) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
                return Integer.valueOf(db3.u(this.f68912zdlpuopuiu, this.f68911yggfygwlhe, this.f68910jyumaefscl, this.f68909iwizpuwonk, this.f68908cqumvgiudr));
            }
        }

        static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ Object[] f68913yggfygwlhe;

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ String f68914zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            ppxfxbqfkf(String str, Object[] objArr) {
                super(1);
                this.f68914zdlpuopuiu = str;
                this.f68913yggfygwlhe = objArr;
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u5.lqeggnwhkg db3) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
                db3.jhduphickx(this.f68914zdlpuopuiu, this.f68913yggfygwlhe);
                return null;
            }
        }

        /* JADX INFO: renamed from: n5.wkgbmnqykc$iobyxmoadg$wkgbmnqykc, reason: collision with other inner class name */
        /* synthetic */ class C1481wkgbmnqykc extends kotlin.jvm.internal.vdvldrhtss implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final C1481wkgbmnqykc f68915zdlpuopuiu = new C1481wkgbmnqykc();

            C1481wkgbmnqykc() {
                super(1, u5.lqeggnwhkg.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(u5.lqeggnwhkg p13) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(p13, "p0");
                return Boolean.valueOf(p13.S());
            }
        }

        static final class zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            final /* synthetic */ String f68916zdlpuopuiu;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            zoijcleaow(String str) {
                super(1);
                this.f68916zdlpuopuiu = str;
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u5.lqeggnwhkg db3) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
                db3.lmojexxdyd(this.f68916zdlpuopuiu);
                return null;
            }
        }

        public iobyxmoadg(n5.ppxfxbqfkf autoCloser) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloser, "autoCloser");
            this.f68903zdlpuopuiu = autoCloser;
        }

        @Override // u5.lqeggnwhkg
        public Cursor E(String query) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            try {
                return new ppxfxbqfkf(this.f68903zdlpuopuiu.btonecajqb().E(query), this.f68903zdlpuopuiu);
            } catch (Throwable th2) {
                this.f68903zdlpuopuiu.eablkybsjg();
                throw th2;
            }
        }

        @Override // u5.lqeggnwhkg
        public boolean S() {
            if (this.f68903zdlpuopuiu.nufgyqmvbu() == null) {
                return false;
            }
            return ((Boolean) this.f68903zdlpuopuiu.lqeggnwhkg(C1481wkgbmnqykc.f68915zdlpuopuiu)).booleanValue();
        }

        @Override // u5.lqeggnwhkg
        public Cursor c0(u5.btonecajqb query) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            try {
                return new ppxfxbqfkf(this.f68903zdlpuopuiu.btonecajqb().c0(query), this.f68903zdlpuopuiu);
            } catch (Throwable th2) {
                this.f68903zdlpuopuiu.eablkybsjg();
                throw th2;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f68903zdlpuopuiu.wkgbmnqykc();
        }

        @Override // u5.lqeggnwhkg
        public boolean d0() {
            return ((Boolean) this.f68903zdlpuopuiu.lqeggnwhkg(eablkybsjg.f68904zdlpuopuiu)).booleanValue();
        }

        @Override // u5.lqeggnwhkg
        public String gxszxtbevo() {
            return (String) this.f68903zdlpuopuiu.lqeggnwhkg(gxszxtbevo.f68905zdlpuopuiu);
        }

        @Override // u5.lqeggnwhkg
        public void ikoacuggdj() {
            try {
                this.f68903zdlpuopuiu.btonecajqb().ikoacuggdj();
            } catch (Throwable th2) {
                this.f68903zdlpuopuiu.eablkybsjg();
                throw th2;
            }
        }

        public final void iobyxmoadg() {
            this.f68903zdlpuopuiu.lqeggnwhkg(lqeggnwhkg.f68907zdlpuopuiu);
        }

        @Override // u5.lqeggnwhkg
        public boolean isOpen() {
            u5.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = this.f68903zdlpuopuiu.nufgyqmvbu();
            if (lqeggnwhkgVarNufgyqmvbu == null) {
                return false;
            }
            return lqeggnwhkgVarNufgyqmvbu.isOpen();
        }

        @Override // u5.lqeggnwhkg
        public void jhduphickx(String sql, Object[] bindArgs) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sql, "sql");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(bindArgs, "bindArgs");
            this.f68903zdlpuopuiu.lqeggnwhkg(new ppxfxbqfkf(sql, bindArgs));
        }

        @Override // u5.lqeggnwhkg
        public u5.gtknphoqwx k(String sql) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sql, "sql");
            return new zoijcleaow(sql, this.f68903zdlpuopuiu);
        }

        @Override // u5.lqeggnwhkg
        public Cursor l(u5.btonecajqb query, CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(query, "query");
            try {
                return new ppxfxbqfkf(this.f68903zdlpuopuiu.btonecajqb().l(query, cancellationSignal), this.f68903zdlpuopuiu);
            } catch (Throwable th2) {
                this.f68903zdlpuopuiu.eablkybsjg();
                throw th2;
            }
        }

        @Override // u5.lqeggnwhkg
        public void lmojexxdyd(String sql) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sql, "sql");
            this.f68903zdlpuopuiu.lqeggnwhkg(new zoijcleaow(sql));
        }

        @Override // u5.lqeggnwhkg
        public void oxmwwwfdhm() {
            try {
                this.f68903zdlpuopuiu.btonecajqb().oxmwwwfdhm();
            } catch (Throwable th2) {
                this.f68903zdlpuopuiu.eablkybsjg();
                throw th2;
            }
        }

        @Override // u5.lqeggnwhkg
        public int u(String table, int i13, ContentValues values, String str, Object[] objArr) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(table, "table");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
            return ((Number) this.f68903zdlpuopuiu.lqeggnwhkg(new nufgyqmvbu(table, i13, values, str, objArr))).intValue();
        }

        @Override // u5.lqeggnwhkg
        public void uwvvkdfqfp() {
            if (this.f68903zdlpuopuiu.nufgyqmvbu() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                u5.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = this.f68903zdlpuopuiu.nufgyqmvbu();
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(lqeggnwhkgVarNufgyqmvbu);
                lqeggnwhkgVarNufgyqmvbu.uwvvkdfqfp();
            } finally {
                this.f68903zdlpuopuiu.eablkybsjg();
            }
        }

        @Override // u5.lqeggnwhkg
        public void vipkmwdibw() {
            wwaezpbzkn wwaezpbzknVar;
            u5.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = this.f68903zdlpuopuiu.nufgyqmvbu();
            if (lqeggnwhkgVarNufgyqmvbu != null) {
                lqeggnwhkgVarNufgyqmvbu.vipkmwdibw();
                wwaezpbzknVar = wwaezpbzkn.f37140iobyxmoadg;
            } else {
                wwaezpbzknVar = null;
            }
            if (wwaezpbzknVar == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // u5.lqeggnwhkg
        public List yadqdtsiqt() {
            return (List) this.f68903zdlpuopuiu.lqeggnwhkg(C1480iobyxmoadg.f68906zdlpuopuiu);
        }
    }

    private static final class ppxfxbqfkf implements Cursor {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final n5.ppxfxbqfkf f68917yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Cursor f68918zdlpuopuiu;

        public ppxfxbqfkf(Cursor delegate, n5.ppxfxbqfkf autoCloser) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloser, "autoCloser");
            this.f68918zdlpuopuiu = delegate;
            this.f68917yggfygwlhe = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f68918zdlpuopuiu.close();
            this.f68917yggfygwlhe.eablkybsjg();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i13, CharArrayBuffer charArrayBuffer) {
            this.f68918zdlpuopuiu.copyStringToBuffer(i13, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f68918zdlpuopuiu.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i13) {
            return this.f68918zdlpuopuiu.getBlob(i13);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f68918zdlpuopuiu.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f68918zdlpuopuiu.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f68918zdlpuopuiu.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i13) {
            return this.f68918zdlpuopuiu.getColumnName(i13);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f68918zdlpuopuiu.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f68918zdlpuopuiu.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i13) {
            return this.f68918zdlpuopuiu.getDouble(i13);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f68918zdlpuopuiu.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i13) {
            return this.f68918zdlpuopuiu.getFloat(i13);
        }

        @Override // android.database.Cursor
        public int getInt(int i13) {
            return this.f68918zdlpuopuiu.getInt(i13);
        }

        @Override // android.database.Cursor
        public long getLong(int i13) {
            return this.f68918zdlpuopuiu.getLong(i13);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return u5.ppxfxbqfkf.iobyxmoadg(this.f68918zdlpuopuiu);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return u5.gxszxtbevo.iobyxmoadg(this.f68918zdlpuopuiu);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f68918zdlpuopuiu.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i13) {
            return this.f68918zdlpuopuiu.getShort(i13);
        }

        @Override // android.database.Cursor
        public String getString(int i13) {
            return this.f68918zdlpuopuiu.getString(i13);
        }

        @Override // android.database.Cursor
        public int getType(int i13) {
            return this.f68918zdlpuopuiu.getType(i13);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f68918zdlpuopuiu.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f68918zdlpuopuiu.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f68918zdlpuopuiu.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f68918zdlpuopuiu.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f68918zdlpuopuiu.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f68918zdlpuopuiu.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i13) {
            return this.f68918zdlpuopuiu.isNull(i13);
        }

        @Override // android.database.Cursor
        public boolean move(int i13) {
            return this.f68918zdlpuopuiu.move(i13);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f68918zdlpuopuiu.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f68918zdlpuopuiu.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f68918zdlpuopuiu.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i13) {
            return this.f68918zdlpuopuiu.moveToPosition(i13);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f68918zdlpuopuiu.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f68918zdlpuopuiu.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f68918zdlpuopuiu.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f68918zdlpuopuiu.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f68918zdlpuopuiu.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(extras, "extras");
            u5.eablkybsjg.iobyxmoadg(this.f68918zdlpuopuiu, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f68918zdlpuopuiu.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr2, List uris) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(cr2, "cr");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(uris, "uris");
            u5.gxszxtbevo.zoijcleaow(this.f68918zdlpuopuiu, cr2, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f68918zdlpuopuiu.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f68918zdlpuopuiu.unregisterDataSetObserver(dataSetObserver);
        }
    }

    private static final class zoijcleaow implements u5.gtknphoqwx {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private final ArrayList f68919jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private final n5.ppxfxbqfkf f68920yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final String f68921zdlpuopuiu;

        static final class iobyxmoadg extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final iobyxmoadg f68922zdlpuopuiu = new iobyxmoadg();

            iobyxmoadg() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Long invoke(u5.gtknphoqwx obj) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(obj, "obj");
                return Long.valueOf(obj.jrbgnlbqoe());
            }
        }

        static final class ppxfxbqfkf extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
            public static final ppxfxbqfkf f68923zdlpuopuiu = new ppxfxbqfkf();

            ppxfxbqfkf() {
                super(1);
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(u5.gtknphoqwx obj) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(obj, "obj");
                return Integer.valueOf(obj.pkzmftpjix());
            }
        }

        /* JADX INFO: renamed from: n5.wkgbmnqykc$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        static final class C1482zoijcleaow extends kotlin.jvm.internal.jyumaefscl implements tg.draadjrbmk {

            /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
            final /* synthetic */ tg.draadjrbmk f68924yggfygwlhe;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1482zoijcleaow(tg.draadjrbmk draadjrbmkVar) {
                super(1);
                this.f68924yggfygwlhe = draadjrbmkVar;
            }

            @Override // tg.draadjrbmk
            /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
            public final Object invoke(u5.lqeggnwhkg db3) {
                kotlin.jvm.internal.zdlpuopuiu.btonecajqb(db3, "db");
                u5.gtknphoqwx gtknphoqwxVarK = db3.k(zoijcleaow.this.f68921zdlpuopuiu);
                zoijcleaow.this.lqeggnwhkg(gtknphoqwxVarK);
                return this.f68924yggfygwlhe.invoke(gtknphoqwxVarK);
            }
        }

        public zoijcleaow(String sql, n5.ppxfxbqfkf autoCloser) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sql, "sql");
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloser, "autoCloser");
            this.f68921zdlpuopuiu = sql;
            this.f68920yggfygwlhe = autoCloser;
            this.f68919jyumaefscl = new ArrayList();
        }

        private final void dxjokdxxww(int i13, Object obj) {
            int size;
            int i14 = i13 - 1;
            if (i14 >= this.f68919jyumaefscl.size() && (size = this.f68919jyumaefscl.size()) <= i14) {
                while (true) {
                    this.f68919jyumaefscl.add(null);
                    if (size == i14) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f68919jyumaefscl.set(i14, obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void lqeggnwhkg(u5.gtknphoqwx gtknphoqwxVar) {
            Iterator it = this.f68919jyumaefscl.iterator();
            int i13 = 0;
            while (it.hasNext()) {
                it.next();
                int i14 = i13 + 1;
                if (i13 < 0) {
                    hg.jyumaefscl.iwizpuwonk();
                }
                Object obj = this.f68919jyumaefscl.get(i13);
                if (obj == null) {
                    gtknphoqwxVar.N(i14);
                } else if (obj instanceof Long) {
                    gtknphoqwxVar.s(i14, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    gtknphoqwxVar.jpowsppfya(i14, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    gtknphoqwxVar.e(i14, (String) obj);
                } else if (obj instanceof byte[]) {
                    gtknphoqwxVar.y(i14, (byte[]) obj);
                }
                i13 = i14;
            }
        }

        private final Object nufgyqmvbu(tg.draadjrbmk draadjrbmkVar) {
            return this.f68920yggfygwlhe.lqeggnwhkg(new C1482zoijcleaow(draadjrbmkVar));
        }

        @Override // u5.dxjokdxxww
        public void N(int i13) {
            dxjokdxxww(i13, null);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // u5.dxjokdxxww
        public void e(int i13, String value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            dxjokdxxww(i13, value);
        }

        @Override // u5.dxjokdxxww
        public void jpowsppfya(int i13, double d13) {
            dxjokdxxww(i13, Double.valueOf(d13));
        }

        @Override // u5.gtknphoqwx
        public long jrbgnlbqoe() {
            return ((Number) nufgyqmvbu(iobyxmoadg.f68922zdlpuopuiu)).longValue();
        }

        @Override // u5.gtknphoqwx
        public int pkzmftpjix() {
            return ((Number) nufgyqmvbu(ppxfxbqfkf.f68923zdlpuopuiu)).intValue();
        }

        @Override // u5.dxjokdxxww
        public void s(int i13, long j13) {
            dxjokdxxww(i13, Long.valueOf(j13));
        }

        @Override // u5.dxjokdxxww
        public void y(int i13, byte[] value) {
            kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
            dxjokdxxww(i13, value);
        }
    }

    public wkgbmnqykc(u5.nufgyqmvbu delegate, n5.ppxfxbqfkf autoCloser) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(autoCloser, "autoCloser");
        this.f68902zdlpuopuiu = delegate;
        this.f68901yggfygwlhe = autoCloser;
        autoCloser.gtknphoqwx(iobyxmoadg());
        this.f68900jyumaefscl = new iobyxmoadg(autoCloser);
    }

    @Override // u5.nufgyqmvbu, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f68900jyumaefscl.close();
    }

    @Override // u5.nufgyqmvbu
    public String getDatabaseName() {
        return this.f68902zdlpuopuiu.getDatabaseName();
    }

    @Override // u5.nufgyqmvbu
    public u5.lqeggnwhkg getWritableDatabase() {
        this.f68900jyumaefscl.iobyxmoadg();
        return this.f68900jyumaefscl;
    }

    @Override // n5.nufgyqmvbu
    public u5.nufgyqmvbu iobyxmoadg() {
        return this.f68902zdlpuopuiu;
    }

    @Override // u5.nufgyqmvbu
    public void setWriteAheadLoggingEnabled(boolean z13) {
        this.f68902zdlpuopuiu.setWriteAheadLoggingEnabled(z13);
    }
}
