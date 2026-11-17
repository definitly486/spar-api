package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.cdpycssgdh;
import com.bumptech.glide.load.resource.bitmap.esjtqupxsv;
import com.bumptech.glide.load.resource.bitmap.iozdgvuglv;
import com.bumptech.glide.load.resource.bitmap.iwizpuwonk;
import com.bumptech.glide.load.resource.bitmap.oxmwwwfdhm;
import com.bumptech.glide.load.resource.bitmap.pmvmpeiblj;
import com.bumptech.glide.load.resource.bitmap.zynmafqrjb;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import r8.cqumvgiudr;
import r8.jyumaefscl;
import r8.kcexrzcfyt;
import r8.yggfygwlhe;
import r8.zdlpuopuiu;

/* JADX INFO: loaded from: classes2.dex */
abstract class draadjrbmk {

    class iobyxmoadg implements g9.gxszxtbevo.zoijcleaow {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        private boolean f20621iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final /* synthetic */ List f20622ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        final /* synthetic */ a9.iobyxmoadg f20623wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final /* synthetic */ zoijcleaow f20624zoijcleaow;

        iobyxmoadg(zoijcleaow zoijcleaowVar, List list, a9.iobyxmoadg iobyxmoadgVar) {
            this.f20624zoijcleaow = zoijcleaowVar;
            this.f20622ppxfxbqfkf = list;
            this.f20623wkgbmnqykc = iobyxmoadgVar;
        }

        @Override // g9.gxszxtbevo.zoijcleaow
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Registry get() {
            if (this.f20621iobyxmoadg) {
                throw new IllegalStateException("Recursive Registry initialization! In your AppGlideModule and LibraryGlideModules, Make sure you're using the provided Registry rather calling glide.getRegistry()!");
            }
            y5.iobyxmoadg.ppxfxbqfkf("Glide registry");
            this.f20621iobyxmoadg = true;
            try {
                return draadjrbmk.iobyxmoadg(this.f20624zoijcleaow, this.f20622ppxfxbqfkf, this.f20623wkgbmnqykc);
            } finally {
                this.f20621iobyxmoadg = false;
                y5.iobyxmoadg.gxszxtbevo();
            }
        }
    }

    static Registry iobyxmoadg(zoijcleaow zoijcleaowVar, List list, a9.iobyxmoadg iobyxmoadgVar) {
        o8.wkgbmnqykc wkgbmnqykcVarGxszxtbevo = zoijcleaowVar.gxszxtbevo();
        o8.zoijcleaow zoijcleaowVarEablkybsjg = zoijcleaowVar.eablkybsjg();
        Context applicationContext = zoijcleaowVar.dxjokdxxww().getApplicationContext();
        eablkybsjg eablkybsjgVarLqeggnwhkg = zoijcleaowVar.dxjokdxxww().lqeggnwhkg();
        Registry registry = new Registry();
        zoijcleaow(applicationContext, registry, wkgbmnqykcVarGxszxtbevo, zoijcleaowVarEablkybsjg, eablkybsjgVarLqeggnwhkg);
        ppxfxbqfkf(applicationContext, zoijcleaowVar, registry, list, iobyxmoadgVar);
        return registry;
    }

    private static void ppxfxbqfkf(Context context, zoijcleaow zoijcleaowVar, Registry registry, List list, a9.iobyxmoadg iobyxmoadgVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a9.zoijcleaow zoijcleaowVar2 = (a9.zoijcleaow) it.next();
            try {
                zoijcleaowVar2.zoijcleaow(context, zoijcleaowVar, registry);
            } catch (AbstractMethodError e13) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + zoijcleaowVar2.getClass().getName(), e13);
            }
        }
        if (iobyxmoadgVar != null) {
            iobyxmoadgVar.iobyxmoadg(context, zoijcleaowVar, registry);
        }
    }

    static g9.gxszxtbevo.zoijcleaow wkgbmnqykc(zoijcleaow zoijcleaowVar, List list, a9.iobyxmoadg iobyxmoadgVar) {
        return new iobyxmoadg(zoijcleaowVar, list, iobyxmoadgVar);
    }

    private static void zoijcleaow(Context context, Registry registry, o8.wkgbmnqykc wkgbmnqykcVar, o8.zoijcleaow zoijcleaowVar, eablkybsjg eablkybsjgVar) {
        l8.dxjokdxxww dxjokdxxwwVar;
        l8.dxjokdxxww zynmafqrjbVar;
        Registry registry2;
        registry.rgvfuqvkyq(new DefaultImageHeaderParser());
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 27) {
            registry.rgvfuqvkyq(new oxmwwwfdhm());
        }
        Resources resources = context.getResources();
        List listLqeggnwhkg = registry.lqeggnwhkg();
        x8.iobyxmoadg iobyxmoadgVar = new x8.iobyxmoadg(context, listLqeggnwhkg, wkgbmnqykcVar, zoijcleaowVar);
        l8.dxjokdxxww dxjokdxxwwVarWflxmlrfwp = iozdgvuglv.wflxmlrfwp(wkgbmnqykcVar);
        com.bumptech.glide.load.resource.bitmap.ojitshcjhn ojitshcjhnVar = new com.bumptech.glide.load.resource.bitmap.ojitshcjhn(registry.lqeggnwhkg(), resources.getDisplayMetrics(), wkgbmnqykcVar, zoijcleaowVar);
        if (i13 < 28 || !eablkybsjgVar.iobyxmoadg(ppxfxbqfkf.zoijcleaow.class)) {
            dxjokdxxwwVar = new com.bumptech.glide.load.resource.bitmap.dxjokdxxww(ojitshcjhnVar);
            zynmafqrjbVar = new zynmafqrjb(ojitshcjhnVar, zoijcleaowVar);
        } else {
            zynmafqrjbVar = new iwizpuwonk();
            dxjokdxxwwVar = new com.bumptech.glide.load.resource.bitmap.gtknphoqwx();
        }
        if (i13 >= 28) {
            registry.eablkybsjg("Animation", InputStream.class, Drawable.class, v8.nufgyqmvbu.gxszxtbevo(listLqeggnwhkg, zoijcleaowVar));
            registry.eablkybsjg("Animation", ByteBuffer.class, Drawable.class, v8.nufgyqmvbu.iobyxmoadg(listLqeggnwhkg, zoijcleaowVar));
        }
        v8.wflxmlrfwp wflxmlrfwpVar = new v8.wflxmlrfwp(context);
        com.bumptech.glide.load.resource.bitmap.ppxfxbqfkf ppxfxbqfkfVar = new com.bumptech.glide.load.resource.bitmap.ppxfxbqfkf(zoijcleaowVar);
        y8.iobyxmoadg iobyxmoadgVar2 = new y8.iobyxmoadg();
        y8.wkgbmnqykc wkgbmnqykcVar2 = new y8.wkgbmnqykc();
        ContentResolver contentResolver = context.getContentResolver();
        registry.ppxfxbqfkf(ByteBuffer.class, new r8.ppxfxbqfkf()).ppxfxbqfkf(InputStream.class, new yggfygwlhe(zoijcleaowVar)).eablkybsjg("Bitmap", ByteBuffer.class, Bitmap.class, dxjokdxxwwVar).eablkybsjg("Bitmap", InputStream.class, Bitmap.class, zynmafqrjbVar);
        if (ParcelFileDescriptorRewinder.ppxfxbqfkf()) {
            registry.eablkybsjg("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new esjtqupxsv(ojitshcjhnVar));
        }
        registry.eablkybsjg("Bitmap", AssetFileDescriptor.class, Bitmap.class, iozdgvuglv.ppxfxbqfkf(wkgbmnqykcVar));
        registry.eablkybsjg("Bitmap", ParcelFileDescriptor.class, Bitmap.class, dxjokdxxwwVarWflxmlrfwp).zoijcleaow(Bitmap.class, Bitmap.class, r8.iwizpuwonk.iobyxmoadg.iobyxmoadg()).eablkybsjg("Bitmap", Bitmap.class, Bitmap.class, new cdpycssgdh()).wkgbmnqykc(Bitmap.class, ppxfxbqfkfVar).eablkybsjg("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.iobyxmoadg(resources, dxjokdxxwwVar)).eablkybsjg("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.iobyxmoadg(resources, zynmafqrjbVar)).eablkybsjg("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.iobyxmoadg(resources, dxjokdxxwwVarWflxmlrfwp)).wkgbmnqykc(BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.zoijcleaow(wkgbmnqykcVar, ppxfxbqfkfVar)).eablkybsjg("Animation", InputStream.class, x8.ppxfxbqfkf.class, new x8.btonecajqb(listLqeggnwhkg, iobyxmoadgVar, zoijcleaowVar)).eablkybsjg("Animation", ByteBuffer.class, x8.ppxfxbqfkf.class, iobyxmoadgVar).wkgbmnqykc(x8.ppxfxbqfkf.class, new x8.wkgbmnqykc()).zoijcleaow(h8.iobyxmoadg.class, h8.iobyxmoadg.class, r8.iwizpuwonk.iobyxmoadg.iobyxmoadg()).eablkybsjg("Bitmap", h8.iobyxmoadg.class, Bitmap.class, new x8.nufgyqmvbu(wkgbmnqykcVar)).iobyxmoadg(Uri.class, Drawable.class, wflxmlrfwpVar).iobyxmoadg(Uri.class, Bitmap.class, new pmvmpeiblj(wflxmlrfwpVar, wkgbmnqykcVar)).vdvldrhtss(new u8.iobyxmoadg.C2800iobyxmoadg()).zoijcleaow(File.class, ByteBuffer.class, new r8.wkgbmnqykc.zoijcleaow()).zoijcleaow(File.class, InputStream.class, new r8.lqeggnwhkg.eablkybsjg()).iobyxmoadg(File.class, File.class, new w8.iobyxmoadg()).zoijcleaow(File.class, ParcelFileDescriptor.class, new r8.lqeggnwhkg.zoijcleaow()).zoijcleaow(File.class, File.class, r8.iwizpuwonk.iobyxmoadg.iobyxmoadg()).vdvldrhtss(new com.bumptech.glide.load.data.gtknphoqwx.iobyxmoadg(zoijcleaowVar));
        if (ParcelFileDescriptorRewinder.ppxfxbqfkf()) {
            registry2 = registry;
            registry2.vdvldrhtss(new ParcelFileDescriptorRewinder.iobyxmoadg());
        } else {
            registry2 = registry;
        }
        r8.ojitshcjhn ojitshcjhnVarLqeggnwhkg = r8.gxszxtbevo.lqeggnwhkg(context);
        r8.ojitshcjhn ojitshcjhnVarPpxfxbqfkf = r8.gxszxtbevo.ppxfxbqfkf(context);
        r8.ojitshcjhn ojitshcjhnVarEablkybsjg = r8.gxszxtbevo.eablkybsjg(context);
        Class cls = Integer.TYPE;
        registry2.zoijcleaow(cls, InputStream.class, ojitshcjhnVarLqeggnwhkg).zoijcleaow(Integer.class, InputStream.class, ojitshcjhnVarLqeggnwhkg).zoijcleaow(cls, AssetFileDescriptor.class, ojitshcjhnVarPpxfxbqfkf).zoijcleaow(Integer.class, AssetFileDescriptor.class, ojitshcjhnVarPpxfxbqfkf).zoijcleaow(cls, Drawable.class, ojitshcjhnVarEablkybsjg).zoijcleaow(Integer.class, Drawable.class, ojitshcjhnVarEablkybsjg).zoijcleaow(Uri.class, InputStream.class, zdlpuopuiu.gxszxtbevo(context)).zoijcleaow(Uri.class, AssetFileDescriptor.class, zdlpuopuiu.eablkybsjg(context));
        kcexrzcfyt.ppxfxbqfkf ppxfxbqfkfVar2 = new kcexrzcfyt.ppxfxbqfkf(resources);
        kcexrzcfyt.iobyxmoadg iobyxmoadgVar3 = new kcexrzcfyt.iobyxmoadg(resources);
        kcexrzcfyt.zoijcleaow zoijcleaowVar2 = new kcexrzcfyt.zoijcleaow(resources);
        registry2.zoijcleaow(Integer.class, Uri.class, ppxfxbqfkfVar2).zoijcleaow(cls, Uri.class, ppxfxbqfkfVar2).zoijcleaow(Integer.class, AssetFileDescriptor.class, iobyxmoadgVar3).zoijcleaow(cls, AssetFileDescriptor.class, iobyxmoadgVar3).zoijcleaow(Integer.class, InputStream.class, zoijcleaowVar2).zoijcleaow(cls, InputStream.class, zoijcleaowVar2);
        registry2.zoijcleaow(String.class, InputStream.class, new r8.eablkybsjg.ppxfxbqfkf()).zoijcleaow(Uri.class, InputStream.class, new r8.eablkybsjg.ppxfxbqfkf()).zoijcleaow(String.class, InputStream.class, new jyumaefscl.ppxfxbqfkf()).zoijcleaow(String.class, ParcelFileDescriptor.class, new jyumaefscl.zoijcleaow()).zoijcleaow(String.class, AssetFileDescriptor.class, new jyumaefscl.iobyxmoadg()).zoijcleaow(Uri.class, InputStream.class, new r8.iobyxmoadg.ppxfxbqfkf(context.getAssets())).zoijcleaow(Uri.class, AssetFileDescriptor.class, new r8.iobyxmoadg.zoijcleaow(context.getAssets())).zoijcleaow(Uri.class, InputStream.class, new s8.zoijcleaow.iobyxmoadg(context)).zoijcleaow(Uri.class, InputStream.class, new s8.ppxfxbqfkf.iobyxmoadg(context));
        if (i13 >= 29) {
            registry2.zoijcleaow(Uri.class, InputStream.class, new s8.wkgbmnqykc.ppxfxbqfkf(context));
            registry2.zoijcleaow(Uri.class, ParcelFileDescriptor.class, new s8.wkgbmnqykc.zoijcleaow(context));
        }
        registry2.zoijcleaow(Uri.class, InputStream.class, new cqumvgiudr.wkgbmnqykc(contentResolver)).zoijcleaow(Uri.class, ParcelFileDescriptor.class, new cqumvgiudr.zoijcleaow(contentResolver)).zoijcleaow(Uri.class, AssetFileDescriptor.class, new cqumvgiudr.iobyxmoadg(contentResolver)).zoijcleaow(Uri.class, InputStream.class, new r8.esjtqupxsv.iobyxmoadg()).zoijcleaow(URL.class, InputStream.class, new s8.lqeggnwhkg.iobyxmoadg()).zoijcleaow(Uri.class, File.class, new r8.draadjrbmk.iobyxmoadg(context)).zoijcleaow(r8.nufgyqmvbu.class, InputStream.class, new s8.iobyxmoadg.C2574iobyxmoadg()).zoijcleaow(byte[].class, ByteBuffer.class, new r8.zoijcleaow.iobyxmoadg()).zoijcleaow(byte[].class, InputStream.class, new r8.zoijcleaow.wkgbmnqykc()).zoijcleaow(Uri.class, Uri.class, r8.iwizpuwonk.iobyxmoadg.iobyxmoadg()).zoijcleaow(Drawable.class, Drawable.class, r8.iwizpuwonk.iobyxmoadg.iobyxmoadg()).iobyxmoadg(Drawable.class, Drawable.class, new v8.agtfadlqog()).oxmwwwfdhm(Bitmap.class, BitmapDrawable.class, new y8.zoijcleaow(resources)).oxmwwwfdhm(Bitmap.class, byte[].class, iobyxmoadgVar2).oxmwwwfdhm(Drawable.class, byte[].class, new y8.ppxfxbqfkf(wkgbmnqykcVar, iobyxmoadgVar2, wkgbmnqykcVar2)).oxmwwwfdhm(x8.ppxfxbqfkf.class, byte[].class, wkgbmnqykcVar2);
        l8.dxjokdxxww dxjokdxxwwVarWkgbmnqykc = iozdgvuglv.wkgbmnqykc(wkgbmnqykcVar);
        registry2.iobyxmoadg(ByteBuffer.class, Bitmap.class, dxjokdxxwwVarWkgbmnqykc);
        registry2.iobyxmoadg(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.resource.bitmap.iobyxmoadg(resources, dxjokdxxwwVarWkgbmnqykc));
    }
}
