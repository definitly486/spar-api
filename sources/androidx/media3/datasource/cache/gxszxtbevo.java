package androidx.media3.datasource.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import com.google.common.collect.jyumaefscl;
import com.google.common.collect.ulzqkzuiru;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
class gxszxtbevo {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private ppxfxbqfkf f9911eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private ppxfxbqfkf f9912gxszxtbevo;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final HashMap f9913iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final SparseBooleanArray f9914ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private final SparseBooleanArray f9915wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final SparseArray f9916zoijcleaow;

    private static final class iobyxmoadg implements ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private static final String[] f9917eablkybsjg = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final a3.iobyxmoadg f9918iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private String f9919ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private String f9920wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final SparseArray f9921zoijcleaow = new SparseArray();

        public iobyxmoadg(a3.iobyxmoadg iobyxmoadgVar) {
            this.f9918iobyxmoadg = iobyxmoadgVar;
        }

        private void agtfadlqog(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            a3.ppxfxbqfkf.wkgbmnqykc(sQLiteDatabase, 1, (String) y2.iobyxmoadg.eablkybsjg(this.f9919ppxfxbqfkf), 1);
            gtknphoqwx(sQLiteDatabase, (String) y2.iobyxmoadg.eablkybsjg(this.f9920wkgbmnqykc));
            sQLiteDatabase.execSQL("CREATE TABLE " + this.f9920wkgbmnqykc + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
        }

        private void btonecajqb(SQLiteDatabase sQLiteDatabase, int i13) {
            sQLiteDatabase.delete((String) y2.iobyxmoadg.eablkybsjg(this.f9920wkgbmnqykc), "id = ?", new String[]{Integer.toString(i13)});
        }

        private Cursor draadjrbmk() {
            return this.f9918iobyxmoadg.getReadableDatabase().query((String) y2.iobyxmoadg.eablkybsjg(this.f9920wkgbmnqykc), f9917eablkybsjg, null, null, null, null, null);
        }

        private static void dxjokdxxww(a3.iobyxmoadg iobyxmoadgVar, String str) throws DatabaseIOException {
            try {
                String strWflxmlrfwp = wflxmlrfwp(str);
                SQLiteDatabase writableDatabase = iobyxmoadgVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    a3.ppxfxbqfkf.ppxfxbqfkf(writableDatabase, 1, str);
                    gtknphoqwx(writableDatabase, strWflxmlrfwp);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e13) {
                throw new DatabaseIOException(e13);
            }
        }

        private static void gtknphoqwx(SQLiteDatabase sQLiteDatabase, String str) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
        }

        private void nufgyqmvbu(SQLiteDatabase sQLiteDatabase, eablkybsjg eablkybsjgVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            gxszxtbevo.oxmwwwfdhm(eablkybsjgVar.ppxfxbqfkf(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(eablkybsjgVar.f9905iobyxmoadg));
            contentValues.put("key", eablkybsjgVar.f9908zoijcleaow);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) y2.iobyxmoadg.eablkybsjg(this.f9920wkgbmnqykc), null, contentValues);
        }

        private static String wflxmlrfwp(String str) {
            return "ExoPlayerCacheIndex" + str;
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void delete() throws DatabaseIOException {
            dxjokdxxww(this.f9918iobyxmoadg, (String) y2.iobyxmoadg.eablkybsjg(this.f9919ppxfxbqfkf));
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void eablkybsjg(HashMap map) throws DatabaseIOException {
            try {
                SQLiteDatabase writableDatabase = this.f9918iobyxmoadg.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    agtfadlqog(writableDatabase);
                    Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        nufgyqmvbu(writableDatabase, (eablkybsjg) it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f9921zoijcleaow.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e13) {
                throw new DatabaseIOException(e13);
            }
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void gxszxtbevo(eablkybsjg eablkybsjgVar) {
            this.f9921zoijcleaow.put(eablkybsjgVar.f9905iobyxmoadg, eablkybsjgVar);
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public boolean iobyxmoadg() throws DatabaseIOException {
            try {
                return a3.ppxfxbqfkf.zoijcleaow(this.f9918iobyxmoadg.getReadableDatabase(), 1, (String) y2.iobyxmoadg.eablkybsjg(this.f9919ppxfxbqfkf)) != -1;
            } catch (SQLException e13) {
                throw new DatabaseIOException(e13);
            }
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void lqeggnwhkg(HashMap map, SparseArray sparseArray) throws DatabaseIOException {
            y2.iobyxmoadg.lqeggnwhkg(this.f9921zoijcleaow.size() == 0);
            try {
                if (a3.ppxfxbqfkf.zoijcleaow(this.f9918iobyxmoadg.getReadableDatabase(), 1, (String) y2.iobyxmoadg.eablkybsjg(this.f9919ppxfxbqfkf)) != 1) {
                    SQLiteDatabase writableDatabase = this.f9918iobyxmoadg.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        agtfadlqog(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorDraadjrbmk = draadjrbmk();
                while (cursorDraadjrbmk.moveToNext()) {
                    try {
                        eablkybsjg eablkybsjgVar = new eablkybsjg(cursorDraadjrbmk.getInt(0), (String) y2.iobyxmoadg.eablkybsjg(cursorDraadjrbmk.getString(1)), gxszxtbevo.ojitshcjhn(new DataInputStream(new ByteArrayInputStream(cursorDraadjrbmk.getBlob(2)))));
                        map.put(eablkybsjgVar.f9908zoijcleaow, eablkybsjgVar);
                        sparseArray.put(eablkybsjgVar.f9905iobyxmoadg, eablkybsjgVar.f9908zoijcleaow);
                    } catch (Throwable th3) {
                        if (cursorDraadjrbmk != null) {
                            try {
                                cursorDraadjrbmk.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorDraadjrbmk.close();
            } catch (SQLiteException e13) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e13);
            }
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void ppxfxbqfkf(long j13) {
            String hexString = Long.toHexString(j13);
            this.f9919ppxfxbqfkf = hexString;
            this.f9920wkgbmnqykc = wflxmlrfwp(hexString);
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void wkgbmnqykc(eablkybsjg eablkybsjgVar, boolean z13) {
            if (z13) {
                this.f9921zoijcleaow.delete(eablkybsjgVar.f9905iobyxmoadg);
            } else {
                this.f9921zoijcleaow.put(eablkybsjgVar.f9905iobyxmoadg, null);
            }
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void zoijcleaow(HashMap map) throws DatabaseIOException {
            if (this.f9921zoijcleaow.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f9918iobyxmoadg.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i13 = 0; i13 < this.f9921zoijcleaow.size(); i13++) {
                    try {
                        eablkybsjg eablkybsjgVar = (eablkybsjg) this.f9921zoijcleaow.valueAt(i13);
                        if (eablkybsjgVar == null) {
                            btonecajqb(writableDatabase, this.f9921zoijcleaow.keyAt(i13));
                        } else {
                            nufgyqmvbu(writableDatabase, eablkybsjgVar);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f9921zoijcleaow.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e13) {
                throw new DatabaseIOException(e13);
            }
        }
    }

    private interface ppxfxbqfkf {
        void delete();

        void eablkybsjg(HashMap map);

        void gxszxtbevo(eablkybsjg eablkybsjgVar);

        boolean iobyxmoadg();

        void lqeggnwhkg(HashMap map, SparseArray sparseArray);

        void ppxfxbqfkf(long j13);

        void wkgbmnqykc(eablkybsjg eablkybsjgVar, boolean z13);

        void zoijcleaow(HashMap map);
    }

    private static class zoijcleaow implements ppxfxbqfkf {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private final y2.zoijcleaow f9922eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private boolean f9923gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private final boolean f9924iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private lqeggnwhkg f9925lqeggnwhkg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final SecretKeySpec f9926ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final SecureRandom f9927wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private final Cipher f9928zoijcleaow;

        public zoijcleaow(File file, byte[] bArr, boolean z13) {
            Cipher cipher;
            SecretKeySpec secretKeySpec;
            y2.iobyxmoadg.lqeggnwhkg((bArr == null && z13) ? false : true);
            if (bArr != null) {
                y2.iobyxmoadg.iobyxmoadg(bArr.length == 16);
                try {
                    cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e13) {
                    throw new IllegalStateException(e13);
                }
            } else {
                y2.iobyxmoadg.iobyxmoadg(!z13);
                cipher = null;
                secretKeySpec = null;
            }
            this.f9924iobyxmoadg = z13;
            this.f9928zoijcleaow = cipher;
            this.f9926ppxfxbqfkf = secretKeySpec;
            this.f9927wkgbmnqykc = z13 ? new SecureRandom() : null;
            this.f9922eablkybsjg = new y2.zoijcleaow(file);
        }

        private boolean btonecajqb(HashMap map, SparseArray sparseArray) throws Throwable {
            if (!this.f9922eablkybsjg.ppxfxbqfkf()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f9922eablkybsjg.wkgbmnqykc());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i13 = dataInputStream2.readInt();
                    if (i13 >= 0 && i13 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f9928zoijcleaow == null) {
                                stevsuqkhv.draadjrbmk(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f9928zoijcleaow.init(2, (Key) stevsuqkhv.nufgyqmvbu(this.f9926ppxfxbqfkf), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f9928zoijcleaow));
                            } catch (InvalidAlgorithmParameterException e13) {
                                e = e13;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e14) {
                                e = e14;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f9924iobyxmoadg) {
                            this.f9923gxszxtbevo = true;
                        }
                        int i14 = dataInputStream2.readInt();
                        int iNufgyqmvbu = 0;
                        for (int i15 = 0; i15 < i14; i15++) {
                            eablkybsjg eablkybsjgVarDxjokdxxww = dxjokdxxww(i13, dataInputStream2);
                            map.put(eablkybsjgVarDxjokdxxww.f9908zoijcleaow, eablkybsjgVarDxjokdxxww);
                            sparseArray.put(eablkybsjgVarDxjokdxxww.f9905iobyxmoadg, eablkybsjgVarDxjokdxxww.f9908zoijcleaow);
                            iNufgyqmvbu += nufgyqmvbu(eablkybsjgVarDxjokdxxww, i13);
                        }
                        int i16 = dataInputStream2.readInt();
                        boolean z13 = dataInputStream2.read() == -1;
                        if (i16 == iNufgyqmvbu && z13) {
                            stevsuqkhv.draadjrbmk(dataInputStream2);
                            return true;
                        }
                        stevsuqkhv.draadjrbmk(dataInputStream2);
                        return false;
                    }
                    stevsuqkhv.draadjrbmk(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        stevsuqkhv.draadjrbmk(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        stevsuqkhv.draadjrbmk(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        private void draadjrbmk(HashMap map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamGxszxtbevo = this.f9922eablkybsjg.gxszxtbevo();
                lqeggnwhkg lqeggnwhkgVar = this.f9925lqeggnwhkg;
                if (lqeggnwhkgVar == null) {
                    this.f9925lqeggnwhkg = new lqeggnwhkg(outputStreamGxszxtbevo);
                } else {
                    lqeggnwhkgVar.iobyxmoadg(outputStreamGxszxtbevo);
                }
                lqeggnwhkg lqeggnwhkgVar2 = this.f9925lqeggnwhkg;
                DataOutputStream dataOutputStream2 = new DataOutputStream(lqeggnwhkgVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iNufgyqmvbu = 0;
                    dataOutputStream2.writeInt(this.f9924iobyxmoadg ? 1 : 0);
                    if (this.f9924iobyxmoadg) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) stevsuqkhv.nufgyqmvbu(this.f9927wkgbmnqykc)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) stevsuqkhv.nufgyqmvbu(this.f9928zoijcleaow)).init(1, (Key) stevsuqkhv.nufgyqmvbu(this.f9926ppxfxbqfkf), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(lqeggnwhkgVar2, this.f9928zoijcleaow));
                        } catch (InvalidAlgorithmParameterException e13) {
                            e = e13;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e14) {
                            e = e14;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (eablkybsjg eablkybsjgVar : map.values()) {
                        gtknphoqwx(eablkybsjgVar, dataOutputStream2);
                        iNufgyqmvbu += nufgyqmvbu(eablkybsjgVar, 2);
                    }
                    dataOutputStream2.writeInt(iNufgyqmvbu);
                    this.f9922eablkybsjg.zoijcleaow(dataOutputStream2);
                    stevsuqkhv.draadjrbmk(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    stevsuqkhv.draadjrbmk(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private eablkybsjg dxjokdxxww(int i13, DataInputStream dataInputStream) throws IOException {
            c3.gxszxtbevo gxszxtbevoVarOjitshcjhn;
            int i14 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i13 < 2) {
                long j13 = dataInputStream.readLong();
                c3.eablkybsjg eablkybsjgVar = new c3.eablkybsjg();
                c3.eablkybsjg.lqeggnwhkg(eablkybsjgVar, j13);
                gxszxtbevoVarOjitshcjhn = c3.gxszxtbevo.f18633ppxfxbqfkf.lqeggnwhkg(eablkybsjgVar);
            } else {
                gxszxtbevoVarOjitshcjhn = gxszxtbevo.ojitshcjhn(dataInputStream);
            }
            return new eablkybsjg(i14, utf, gxszxtbevoVarOjitshcjhn);
        }

        private void gtknphoqwx(eablkybsjg eablkybsjgVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(eablkybsjgVar.f9905iobyxmoadg);
            dataOutputStream.writeUTF(eablkybsjgVar.f9908zoijcleaow);
            gxszxtbevo.oxmwwwfdhm(eablkybsjgVar.ppxfxbqfkf(), dataOutputStream);
        }

        private int nufgyqmvbu(eablkybsjg eablkybsjgVar, int i13) {
            int i14;
            int iHashCode;
            int iHashCode2 = (eablkybsjgVar.f9905iobyxmoadg * 31) + eablkybsjgVar.f9908zoijcleaow.hashCode();
            if (i13 < 2) {
                long jIobyxmoadg = c3.wkgbmnqykc.iobyxmoadg(eablkybsjgVar.ppxfxbqfkf());
                i14 = iHashCode2 * 31;
                iHashCode = (int) (jIobyxmoadg ^ (jIobyxmoadg >>> 32));
            } else {
                i14 = iHashCode2 * 31;
                iHashCode = eablkybsjgVar.ppxfxbqfkf().hashCode();
            }
            return i14 + iHashCode;
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void delete() {
            this.f9922eablkybsjg.iobyxmoadg();
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void eablkybsjg(HashMap map) throws Throwable {
            draadjrbmk(map);
            this.f9923gxszxtbevo = false;
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void gxszxtbevo(eablkybsjg eablkybsjgVar) {
            this.f9923gxszxtbevo = true;
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public boolean iobyxmoadg() {
            return this.f9922eablkybsjg.ppxfxbqfkf();
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void lqeggnwhkg(HashMap map, SparseArray sparseArray) {
            y2.iobyxmoadg.lqeggnwhkg(!this.f9923gxszxtbevo);
            if (btonecajqb(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f9922eablkybsjg.iobyxmoadg();
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void ppxfxbqfkf(long j13) {
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void wkgbmnqykc(eablkybsjg eablkybsjgVar, boolean z13) {
            this.f9923gxszxtbevo = true;
        }

        @Override // androidx.media3.datasource.cache.gxszxtbevo.ppxfxbqfkf
        public void zoijcleaow(HashMap map) throws Throwable {
            if (this.f9923gxszxtbevo) {
                eablkybsjg(map);
            }
        }
    }

    public gxszxtbevo(a3.iobyxmoadg iobyxmoadgVar, File file, byte[] bArr, boolean z13, boolean z14) {
        y2.iobyxmoadg.lqeggnwhkg((iobyxmoadgVar == null && file == null) ? false : true);
        this.f9913iobyxmoadg = new HashMap();
        this.f9916zoijcleaow = new SparseArray();
        this.f9914ppxfxbqfkf = new SparseBooleanArray();
        this.f9915wkgbmnqykc = new SparseBooleanArray();
        iobyxmoadg iobyxmoadgVar2 = iobyxmoadgVar != null ? new iobyxmoadg(iobyxmoadgVar) : null;
        zoijcleaow zoijcleaowVar = file != null ? new zoijcleaow(new File(file, "cached_content_index.exi"), bArr, z13) : null;
        if (iobyxmoadgVar2 == null || (zoijcleaowVar != null && z14)) {
            this.f9911eablkybsjg = (ppxfxbqfkf) stevsuqkhv.nufgyqmvbu(zoijcleaowVar);
            this.f9912gxszxtbevo = iobyxmoadgVar2;
        } else {
            this.f9911eablkybsjg = iobyxmoadgVar2;
            this.f9912gxszxtbevo = zoijcleaowVar;
        }
    }

    static int btonecajqb(SparseArray sparseArray) {
        int size = sparseArray.size();
        int i13 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i13 < size && i13 == sparseArray.keyAt(i13)) {
            i13++;
        }
        return i13;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static c3.gxszxtbevo ojitshcjhn(DataInputStream dataInputStream) throws IOException {
        int i13 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i14 = 0; i14 < i13; i14++) {
            String utf = dataInputStream.readUTF();
            int i15 = dataInputStream.readInt();
            if (i15 < 0) {
                throw new IOException("Invalid value size: " + i15);
            }
            int iMin = Math.min(i15, 10485760);
            byte[] bArrCopyOf = stevsuqkhv.f123601gxszxtbevo;
            int i16 = 0;
            while (i16 != i15) {
                int i17 = i16 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i17);
                dataInputStream.readFully(bArrCopyOf, i16, iMin);
                iMin = Math.min(i15 - i17, 10485760);
                i16 = i17;
            }
            map.put(utf, bArrCopyOf);
        }
        return new c3.gxszxtbevo(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oxmwwwfdhm(c3.gxszxtbevo gxszxtbevoVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setNufgyqmvbu = gxszxtbevoVar.nufgyqmvbu();
        dataOutputStream.writeInt(setNufgyqmvbu.size());
        for (Map.Entry entry : setNufgyqmvbu) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    private eablkybsjg ppxfxbqfkf(String str) {
        int iBtonecajqb = btonecajqb(this.f9916zoijcleaow);
        eablkybsjg eablkybsjgVar = new eablkybsjg(iBtonecajqb, str);
        this.f9913iobyxmoadg.put(str, eablkybsjgVar);
        this.f9916zoijcleaow.put(iBtonecajqb, str);
        this.f9915wkgbmnqykc.put(iBtonecajqb, true);
        this.f9911eablkybsjg.gxszxtbevo(eablkybsjgVar);
        return eablkybsjgVar;
    }

    public static boolean wflxmlrfwp(String str) {
        return str.startsWith("cached_content_index.exi");
    }

    public void agtfadlqog(String str) {
        eablkybsjg eablkybsjgVar = (eablkybsjg) this.f9913iobyxmoadg.get(str);
        if (eablkybsjgVar != null && eablkybsjgVar.gxszxtbevo() && eablkybsjgVar.nufgyqmvbu()) {
            this.f9913iobyxmoadg.remove(str);
            int i13 = eablkybsjgVar.f9905iobyxmoadg;
            boolean z13 = this.f9915wkgbmnqykc.get(i13);
            this.f9911eablkybsjg.wkgbmnqykc(eablkybsjgVar, z13);
            if (z13) {
                this.f9916zoijcleaow.remove(i13);
                this.f9915wkgbmnqykc.delete(i13);
            } else {
                this.f9916zoijcleaow.put(i13, null);
                this.f9914ppxfxbqfkf.put(i13, true);
            }
        }
    }

    public void draadjrbmk(long j13) {
        ppxfxbqfkf ppxfxbqfkfVar;
        this.f9911eablkybsjg.ppxfxbqfkf(j13);
        ppxfxbqfkf ppxfxbqfkfVar2 = this.f9912gxszxtbevo;
        if (ppxfxbqfkfVar2 != null) {
            ppxfxbqfkfVar2.ppxfxbqfkf(j13);
        }
        if (this.f9911eablkybsjg.iobyxmoadg() || (ppxfxbqfkfVar = this.f9912gxszxtbevo) == null || !ppxfxbqfkfVar.iobyxmoadg()) {
            this.f9911eablkybsjg.lqeggnwhkg(this.f9913iobyxmoadg, this.f9916zoijcleaow);
        } else {
            this.f9912gxszxtbevo.lqeggnwhkg(this.f9913iobyxmoadg, this.f9916zoijcleaow);
            this.f9911eablkybsjg.eablkybsjg(this.f9913iobyxmoadg);
        }
        ppxfxbqfkf ppxfxbqfkfVar3 = this.f9912gxszxtbevo;
        if (ppxfxbqfkfVar3 != null) {
            ppxfxbqfkfVar3.delete();
            this.f9912gxszxtbevo = null;
        }
    }

    public String dxjokdxxww(int i13) {
        return (String) this.f9916zoijcleaow.get(i13);
    }

    public int eablkybsjg(String str) {
        return gtknphoqwx(str).f9905iobyxmoadg;
    }

    public eablkybsjg gtknphoqwx(String str) {
        eablkybsjg eablkybsjgVar = (eablkybsjg) this.f9913iobyxmoadg.get(str);
        return eablkybsjgVar == null ? ppxfxbqfkf(str) : eablkybsjgVar;
    }

    public eablkybsjg gxszxtbevo(String str) {
        return (eablkybsjg) this.f9913iobyxmoadg.get(str);
    }

    public Collection lqeggnwhkg() {
        return Collections.unmodifiableCollection(this.f9913iobyxmoadg.values());
    }

    public c3.wkgbmnqykc nufgyqmvbu(String str) {
        eablkybsjg eablkybsjgVarGxszxtbevo = gxszxtbevo(str);
        return eablkybsjgVarGxszxtbevo != null ? eablkybsjgVarGxszxtbevo.ppxfxbqfkf() : c3.gxszxtbevo.f18633ppxfxbqfkf;
    }

    public void rgvfuqvkyq() {
        ulzqkzuiru it = jyumaefscl.yggfygwlhe(this.f9913iobyxmoadg.keySet()).iterator();
        while (it.hasNext()) {
            agtfadlqog((String) it.next());
        }
    }

    public void vdvldrhtss() {
        this.f9911eablkybsjg.zoijcleaow(this.f9913iobyxmoadg);
        int size = this.f9914ppxfxbqfkf.size();
        for (int i13 = 0; i13 < size; i13++) {
            this.f9916zoijcleaow.remove(this.f9914ppxfxbqfkf.keyAt(i13));
        }
        this.f9914ppxfxbqfkf.clear();
        this.f9915wkgbmnqykc.clear();
    }

    public void wkgbmnqykc(String str, c3.eablkybsjg eablkybsjgVar) {
        eablkybsjg eablkybsjgVarGtknphoqwx = gtknphoqwx(str);
        if (eablkybsjgVarGtknphoqwx.zoijcleaow(eablkybsjgVar)) {
            this.f9911eablkybsjg.gxszxtbevo(eablkybsjgVarGtknphoqwx);
        }
    }
}
