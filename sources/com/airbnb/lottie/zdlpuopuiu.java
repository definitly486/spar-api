package com.airbnb.lottie;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import modern.payments.ecomAndroid.util.view.CardDateFormatTextWatcher;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zdlpuopuiu {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final Map f20530iobyxmoadg = new HashMap();

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private static final Set f20533zoijcleaow = new HashSet();

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final byte[] f20531ppxfxbqfkf = {80, 75, 3, 4};

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final byte[] f20532wkgbmnqykc = {31, -117, 8};

    public static kegysxyocb agtfadlqog(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return btonecajqb(str2, new Callable() { // from class: com.airbnb.lottie.agtfadlqog
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zdlpuopuiu.rgvfuqvkyq(applicationContext, str, str2);
            }
        }, null);
    }

    private static kegysxyocb btonecajqb(final String str, Callable callable, Runnable runnable) {
        btonecajqb btonecajqbVarZoijcleaow = str == null ? null : o7.lqeggnwhkg.ppxfxbqfkf().zoijcleaow(str);
        kegysxyocb kegysxyocbVar = btonecajqbVarZoijcleaow != null ? new kegysxyocb(btonecajqbVarZoijcleaow) : null;
        if (str != null) {
            Map map = f20530iobyxmoadg;
            if (map.containsKey(str)) {
                kegysxyocbVar = (kegysxyocb) map.get(str);
            }
        }
        if (kegysxyocbVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return kegysxyocbVar;
        }
        kegysxyocb kegysxyocbVar2 = new kegysxyocb(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            kegysxyocbVar2.wkgbmnqykc(new hkdspvbjdz() { // from class: com.airbnb.lottie.ojitshcjhn
                @Override // com.airbnb.lottie.hkdspvbjdz
                public final void iobyxmoadg(Object obj) {
                    zdlpuopuiu.pkzmftpjix(str, atomicBoolean, (btonecajqb) obj);
                }
            });
            kegysxyocbVar2.ppxfxbqfkf(new hkdspvbjdz() { // from class: com.airbnb.lottie.rgvfuqvkyq
                @Override // com.airbnb.lottie.hkdspvbjdz
                public final void iobyxmoadg(Object obj) {
                    zdlpuopuiu.hcddaimhww(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f20530iobyxmoadg;
                map2.put(str, kegysxyocbVar2);
                if (map2.size() == 1) {
                    mbcevpiqjq(false);
                }
            }
        }
        return kegysxyocbVar2;
    }

    public static wypolnanlu cdpycssgdh(Context context, ZipInputStream zipInputStream, String str) {
        return yadqdtsiqt(context, zipInputStream, str, true);
    }

    public static wypolnanlu cqumvgiudr(Context context, int i13) {
        return esjtqupxsv(context, i13, ntlheqmsrt(context, i13));
    }

    private static jpowsppfya draadjrbmk(btonecajqb btonecajqbVar, String str) {
        for (jpowsppfya jpowsppfyaVar : btonecajqbVar.btonecajqb().values()) {
            if (jpowsppfyaVar.ppxfxbqfkf().equals(str)) {
                return jpowsppfyaVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wypolnanlu dsvhmnatus(WeakReference weakReference, Context context, int i13, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return esjtqupxsv(context, i13, str);
    }

    public static wypolnanlu esjtqupxsv(Context context, int i13, String str) {
        btonecajqb btonecajqbVarZoijcleaow = str == null ? null : o7.lqeggnwhkg.ppxfxbqfkf().zoijcleaow(str);
        if (btonecajqbVarZoijcleaow != null) {
            return new wypolnanlu(btonecajqbVarZoijcleaow);
        }
        try {
            bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.btonecajqb(context.getResources().openRawResource(i13)));
            if (ylkuphrtab(eablkybsjgVarPpxfxbqfkf).booleanValue()) {
                return cdpycssgdh(context, new ZipInputStream(eablkybsjgVarPpxfxbqfkf.j0()), str);
            }
            if (!lmojexxdyd(eablkybsjgVarPpxfxbqfkf).booleanValue()) {
                return oxmwwwfdhm(eablkybsjgVarPpxfxbqfkf.j0(), str);
            }
            try {
                return oxmwwwfdhm(new GZIPInputStream(eablkybsjgVarPpxfxbqfkf.j0()), str);
            } catch (IOException e13) {
                return new wypolnanlu((Throwable) e13);
            }
        } catch (Resources.NotFoundException e14) {
            return new wypolnanlu((Throwable) e14);
        }
    }

    public static void gtknphoqwx(Context context) {
        f20530iobyxmoadg.clear();
        o7.lqeggnwhkg.ppxfxbqfkf().iobyxmoadg();
        s7.lqeggnwhkg lqeggnwhkgVarNufgyqmvbu = eablkybsjg.nufgyqmvbu(context);
        if (lqeggnwhkgVarNufgyqmvbu != null) {
            lqeggnwhkgVarNufgyqmvbu.iobyxmoadg();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void hcddaimhww(String str, AtomicBoolean atomicBoolean, Throwable th2) {
        Map map = f20530iobyxmoadg;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            mbcevpiqjq(true);
        }
    }

    private static wypolnanlu iozdgvuglv(Context context, ZipInputStream zipInputStream, String str) {
        btonecajqb btonecajqbVarZoijcleaow;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            btonecajqbVarZoijcleaow = null;
        } else {
            try {
                btonecajqbVarZoijcleaow = o7.lqeggnwhkg.ppxfxbqfkf().zoijcleaow(str);
            } catch (IOException e13) {
                return new wypolnanlu((Throwable) e13);
            }
        }
        if (btonecajqbVarZoijcleaow != null) {
            return new wypolnanlu(btonecajqbVarZoijcleaow);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        btonecajqb btonecajqbVar = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                btonecajqbVar = (btonecajqb) yggfygwlhe(u7.ppxfxbqfkf.kcexrzcfyt(bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.btonecajqb(zipInputStream))), null, false).zoijcleaow();
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split(CardDateFormatTextWatcher.DIVIDER_CHARACTER);
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                File file = new File(context.getCacheDir(), str2);
                new FileOutputStream(file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int i13 = zipInputStream.read(bArr);
                            if (i13 == -1) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i13);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        if (!file.delete()) {
                            v7.wkgbmnqykc.ppxfxbqfkf("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                        }
                        map2.put(str3, typefaceCreateFromFile);
                    } catch (Throwable th2) {
                        try {
                            fileOutputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (Throwable th4) {
                    v7.wkgbmnqykc.wkgbmnqykc("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th4);
                }
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (btonecajqbVar == null) {
            return new wypolnanlu((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            jpowsppfya jpowsppfyaVarDraadjrbmk = draadjrbmk(btonecajqbVar, (String) entry.getKey());
            if (jpowsppfyaVarDraadjrbmk != null) {
                jpowsppfyaVarDraadjrbmk.lqeggnwhkg(v7.btonecajqb.draadjrbmk((Bitmap) entry.getValue(), jpowsppfyaVarDraadjrbmk.gxszxtbevo(), jpowsppfyaVarDraadjrbmk.wkgbmnqykc()));
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z13 = false;
            for (o7.ppxfxbqfkf ppxfxbqfkfVar : btonecajqbVar.lqeggnwhkg().values()) {
                if (ppxfxbqfkfVar.iobyxmoadg().equals(entry2.getKey())) {
                    ppxfxbqfkfVar.eablkybsjg((Typeface) entry2.getValue());
                    z13 = true;
                }
            }
            if (!z13) {
                v7.wkgbmnqykc.ppxfxbqfkf("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it = btonecajqbVar.btonecajqb().entrySet().iterator();
            while (it.hasNext()) {
                jpowsppfya jpowsppfyaVar = (jpowsppfya) ((Map.Entry) it.next()).getValue();
                if (jpowsppfyaVar == null) {
                    return null;
                }
                String strPpxfxbqfkf = jpowsppfyaVar.ppxfxbqfkf();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (strPpxfxbqfkf.startsWith("data:") && strPpxfxbqfkf.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(strPpxfxbqfkf.substring(strPpxfxbqfkf.indexOf(44) + 1), 0);
                        jpowsppfyaVar.lqeggnwhkg(BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
                    } catch (IllegalArgumentException e14) {
                        v7.wkgbmnqykc.wkgbmnqykc("data URL did not have correct base64 format.", e14);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            o7.lqeggnwhkg.ppxfxbqfkf().wkgbmnqykc(str, btonecajqbVar);
        }
        return new wypolnanlu(btonecajqbVar);
    }

    public static kegysxyocb istkbnxepw(ZipInputStream zipInputStream, String str) {
        return zynmafqrjb(null, zipInputStream, str);
    }

    public static kegysxyocb iwizpuwonk(Context context, final int i13, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return btonecajqb(str, new Callable() { // from class: com.airbnb.lottie.vdvldrhtss
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zdlpuopuiu.dsvhmnatus(weakReference, applicationContext, i13, str);
            }
        }, null);
    }

    public static kegysxyocb jyumaefscl(Context context, int i13) {
        return iwizpuwonk(context, i13, ntlheqmsrt(context, i13));
    }

    public static wypolnanlu kcexrzcfyt(InputStream inputStream, String str, boolean z13) {
        return zdlpuopuiu(u7.ppxfxbqfkf.kcexrzcfyt(bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.btonecajqb(inputStream))), str, z13);
    }

    public static kegysxyocb lereixgezr(Context context, String str) {
        return pmvmpeiblj(context, str, "url_" + str);
    }

    private static Boolean lmojexxdyd(bl.eablkybsjg eablkybsjgVar) {
        return tzroggbefp(eablkybsjgVar, f20532wkgbmnqykc);
    }

    private static void mbcevpiqjq(boolean z13) {
        ArrayList arrayList = new ArrayList(f20533zoijcleaow);
        if (arrayList.size() <= 0) {
            return;
        }
        androidx.appcompat.app.yggfygwlhe.iobyxmoadg(arrayList.get(0));
        throw null;
    }

    private static String ntlheqmsrt(Context context, int i13) {
        StringBuilder sb3 = new StringBuilder();
        sb3.append("rawRes");
        sb3.append(wwaezpbzkn(context) ? "_night_" : "_day_");
        sb3.append(i13);
        return sb3.toString();
    }

    public static wypolnanlu ojitshcjhn(Context context, String str) {
        return rgvfuqvkyq(context, str, "asset_" + str);
    }

    public static wypolnanlu oxmwwwfdhm(InputStream inputStream, String str) {
        return kcexrzcfyt(inputStream, str, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void pkzmftpjix(String str, AtomicBoolean atomicBoolean, btonecajqb btonecajqbVar) {
        Map map = f20530iobyxmoadg;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            mbcevpiqjq(true);
        }
    }

    public static kegysxyocb pmvmpeiblj(final Context context, final String str, final String str2) {
        return btonecajqb(str2, new Callable() { // from class: com.airbnb.lottie.gtknphoqwx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zdlpuopuiu.wypolnanlu(context, str, str2);
            }
        }, null);
    }

    public static wypolnanlu rgvfuqvkyq(Context context, String str, String str2) {
        btonecajqb btonecajqbVarZoijcleaow = str2 == null ? null : o7.lqeggnwhkg.ppxfxbqfkf().zoijcleaow(str2);
        if (btonecajqbVarZoijcleaow != null) {
            return new wypolnanlu(btonecajqbVarZoijcleaow);
        }
        try {
            bl.eablkybsjg eablkybsjgVarPpxfxbqfkf = bl.zdlpuopuiu.ppxfxbqfkf(bl.zdlpuopuiu.btonecajqb(context.getAssets().open(str)));
            if (ylkuphrtab(eablkybsjgVarPpxfxbqfkf).booleanValue()) {
                return cdpycssgdh(context, new ZipInputStream(eablkybsjgVarPpxfxbqfkf.j0()), str2);
            }
            return lmojexxdyd(eablkybsjgVarPpxfxbqfkf).booleanValue() ? oxmwwwfdhm(new GZIPInputStream(eablkybsjgVarPpxfxbqfkf.j0()), str2) : oxmwwwfdhm(eablkybsjgVarPpxfxbqfkf.j0(), str2);
        } catch (IOException e13) {
            return new wypolnanlu((Throwable) e13);
        }
    }

    private static Boolean tzroggbefp(bl.eablkybsjg eablkybsjgVar, byte[] bArr) {
        try {
            bl.eablkybsjg eablkybsjgVarPeek = eablkybsjgVar.peek();
            for (byte b13 : bArr) {
                if (eablkybsjgVarPeek.readByte() != b13) {
                    return Boolean.FALSE;
                }
            }
            eablkybsjgVarPeek.close();
            return Boolean.TRUE;
        } catch (Exception e13) {
            v7.wkgbmnqykc.zoijcleaow("Failed to check zip file header", e13);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    public static kegysxyocb vdvldrhtss(final InputStream inputStream, final String str) {
        return btonecajqb(str, new Callable() { // from class: com.airbnb.lottie.draadjrbmk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zdlpuopuiu.oxmwwwfdhm(inputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.wflxmlrfwp
            @Override // java.lang.Runnable
            public final void run() {
                v7.btonecajqb.ppxfxbqfkf(inputStream);
            }
        });
    }

    public static kegysxyocb wflxmlrfwp(Context context, String str) {
        return agtfadlqog(context, str, "asset_" + str);
    }

    private static boolean wwaezpbzkn(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ wypolnanlu wypolnanlu(Context context, String str, String str2) {
        wypolnanlu wypolnanluVarPpxfxbqfkf = eablkybsjg.dxjokdxxww(context).ppxfxbqfkf(context, str, str2);
        if (str2 != null && wypolnanluVarPpxfxbqfkf.zoijcleaow() != null) {
            o7.lqeggnwhkg.ppxfxbqfkf().wkgbmnqykc(str2, (btonecajqb) wypolnanluVarPpxfxbqfkf.zoijcleaow());
        }
        return wypolnanluVarPpxfxbqfkf;
    }

    public static wypolnanlu yadqdtsiqt(Context context, ZipInputStream zipInputStream, String str, boolean z13) {
        try {
            return iozdgvuglv(context, zipInputStream, str);
        } finally {
            if (z13) {
                v7.btonecajqb.ppxfxbqfkf(zipInputStream);
            }
        }
    }

    private static wypolnanlu yggfygwlhe(u7.ppxfxbqfkf ppxfxbqfkfVar, String str, boolean z13) {
        try {
            btonecajqb btonecajqbVarZoijcleaow = str == null ? null : o7.lqeggnwhkg.ppxfxbqfkf().zoijcleaow(str);
            if (btonecajqbVarZoijcleaow != null) {
                return new wypolnanlu(btonecajqbVarZoijcleaow);
            }
            btonecajqb btonecajqbVarIobyxmoadg = t7.iwizpuwonk.iobyxmoadg(ppxfxbqfkfVar);
            if (str != null) {
                o7.lqeggnwhkg.ppxfxbqfkf().wkgbmnqykc(str, btonecajqbVarIobyxmoadg);
            }
            return new wypolnanlu(btonecajqbVarIobyxmoadg);
        } catch (Exception e13) {
            return new wypolnanlu((Throwable) e13);
        } finally {
            if (z13) {
                v7.btonecajqb.ppxfxbqfkf(ppxfxbqfkfVar);
            }
        }
    }

    private static Boolean ylkuphrtab(bl.eablkybsjg eablkybsjgVar) {
        return tzroggbefp(eablkybsjgVar, f20531ppxfxbqfkf);
    }

    public static wypolnanlu zdlpuopuiu(u7.ppxfxbqfkf ppxfxbqfkfVar, String str, boolean z13) {
        return yggfygwlhe(ppxfxbqfkfVar, str, z13);
    }

    public static kegysxyocb zynmafqrjb(final Context context, final ZipInputStream zipInputStream, final String str) {
        return btonecajqb(str, new Callable() { // from class: com.airbnb.lottie.oxmwwwfdhm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zdlpuopuiu.cdpycssgdh(context, zipInputStream, str);
            }
        }, new Runnable() { // from class: com.airbnb.lottie.kcexrzcfyt
            @Override // java.lang.Runnable
            public final void run() {
                v7.btonecajqb.ppxfxbqfkf(zipInputStream);
            }
        });
    }
}
