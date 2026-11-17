package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class wflxmlrfwp {

    public static abstract class gxszxtbevo {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        protected eablkybsjg f8444iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        CharSequence f8445ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        boolean f8446wkgbmnqykc = false;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        CharSequence f8447zoijcleaow;

        public RemoteViews eablkybsjg(draadjrbmk draadjrbmkVar) {
            return null;
        }

        public RemoteViews gxszxtbevo(draadjrbmk draadjrbmkVar) {
            return null;
        }

        public void iobyxmoadg(Bundle bundle) {
            if (this.f8446wkgbmnqykc) {
                bundle.putCharSequence("android.summaryText", this.f8445ppxfxbqfkf);
            }
            CharSequence charSequence = this.f8447zoijcleaow;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strPpxfxbqfkf = ppxfxbqfkf();
            if (strPpxfxbqfkf != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strPpxfxbqfkf);
            }
        }

        public void lqeggnwhkg(eablkybsjg eablkybsjgVar) {
            if (this.f8444iobyxmoadg != eablkybsjgVar) {
                this.f8444iobyxmoadg = eablkybsjgVar;
                if (eablkybsjgVar != null) {
                    eablkybsjgVar.jyumaefscl(this);
                }
            }
        }

        protected abstract String ppxfxbqfkf();

        public RemoteViews wkgbmnqykc(draadjrbmk draadjrbmkVar) {
            return null;
        }

        public abstract void zoijcleaow(draadjrbmk draadjrbmkVar);
    }

    public static class iobyxmoadg {

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        public CharSequence f8448btonecajqb;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        private boolean f8449draadjrbmk;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        public int f8450dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private boolean f8451eablkybsjg;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        public PendingIntent f8452gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        boolean f8453gxszxtbevo;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final Bundle f8454iobyxmoadg;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private final int f8455lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private final boolean f8456nufgyqmvbu;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final zdlpuopuiu[] f8457ppxfxbqfkf;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        private final zdlpuopuiu[] f8458wkgbmnqykc;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        private IconCompat f8459zoijcleaow;

        public iobyxmoadg(int i13, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i13 != 0 ? IconCompat.nufgyqmvbu(null, "", i13) : null, charSequence, pendingIntent);
        }

        public boolean btonecajqb() {
            return this.f8456nufgyqmvbu;
        }

        public boolean dxjokdxxww() {
            return this.f8449draadjrbmk;
        }

        public zdlpuopuiu[] eablkybsjg() {
            return this.f8457ppxfxbqfkf;
        }

        public int gxszxtbevo() {
            return this.f8455lqeggnwhkg;
        }

        public PendingIntent iobyxmoadg() {
            return this.f8452gtknphoqwx;
        }

        public boolean lqeggnwhkg() {
            return this.f8453gxszxtbevo;
        }

        public CharSequence nufgyqmvbu() {
            return this.f8448btonecajqb;
        }

        public Bundle ppxfxbqfkf() {
            return this.f8454iobyxmoadg;
        }

        public IconCompat wkgbmnqykc() {
            int i13;
            if (this.f8459zoijcleaow == null && (i13 = this.f8450dxjokdxxww) != 0) {
                this.f8459zoijcleaow = IconCompat.nufgyqmvbu(null, "", i13);
            }
            return this.f8459zoijcleaow;
        }

        public boolean zoijcleaow() {
            return this.f8451eablkybsjg;
        }

        public iobyxmoadg(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        iobyxmoadg(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, zdlpuopuiu[] zdlpuopuiuVarArr, zdlpuopuiu[] zdlpuopuiuVarArr2, boolean z13, int i13, boolean z14, boolean z15, boolean z16) {
            this.f8453gxszxtbevo = true;
            this.f8459zoijcleaow = iconCompat;
            if (iconCompat != null && iconCompat.draadjrbmk() == 2) {
                this.f8450dxjokdxxww = iconCompat.btonecajqb();
            }
            this.f8448btonecajqb = eablkybsjg.wkgbmnqykc(charSequence);
            this.f8452gtknphoqwx = pendingIntent;
            this.f8454iobyxmoadg = bundle == null ? new Bundle() : bundle;
            this.f8457ppxfxbqfkf = zdlpuopuiuVarArr;
            this.f8458wkgbmnqykc = zdlpuopuiuVarArr2;
            this.f8451eablkybsjg = z13;
            this.f8455lqeggnwhkg = i13;
            this.f8453gxszxtbevo = z14;
            this.f8456nufgyqmvbu = z15;
            this.f8449draadjrbmk = z16;
        }
    }

    public static class ppxfxbqfkf extends gxszxtbevo {

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private CharSequence f8460eablkybsjg;

        @Override // androidx.core.app.wflxmlrfwp.gxszxtbevo
        public void iobyxmoadg(Bundle bundle) {
            super.iobyxmoadg(bundle);
        }

        public ppxfxbqfkf nufgyqmvbu(CharSequence charSequence) {
            this.f8460eablkybsjg = eablkybsjg.wkgbmnqykc(charSequence);
            return this;
        }

        @Override // androidx.core.app.wflxmlrfwp.gxszxtbevo
        protected String ppxfxbqfkf() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.wflxmlrfwp.gxszxtbevo
        public void zoijcleaow(draadjrbmk draadjrbmkVar) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(draadjrbmkVar.iobyxmoadg()).setBigContentTitle(this.f8447zoijcleaow).bigText(this.f8460eablkybsjg);
            if (this.f8446wkgbmnqykc) {
                bigTextStyleBigText.setSummaryText(this.f8445ppxfxbqfkf);
            }
        }
    }

    public static final class wkgbmnqykc {
        public static Notification.BubbleMetadata iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            return null;
        }
    }

    public static class zoijcleaow extends gxszxtbevo {

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        private boolean f8461dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        private IconCompat f8462eablkybsjg;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        private IconCompat f8463gxszxtbevo;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        private boolean f8464lqeggnwhkg;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        private CharSequence f8465nufgyqmvbu;

        private static class iobyxmoadg {
            static void iobyxmoadg(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        /* JADX INFO: renamed from: androidx.core.app.wflxmlrfwp$zoijcleaow$zoijcleaow, reason: collision with other inner class name */
        private static class C0133zoijcleaow {
            static void iobyxmoadg(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void ppxfxbqfkf(Notification.BigPictureStyle bigPictureStyle, boolean z13) {
                bigPictureStyle.showBigPictureWhenCollapsed(z13);
            }

            static void zoijcleaow(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }
        }

        public zoijcleaow btonecajqb(Bitmap bitmap) {
            this.f8462eablkybsjg = bitmap == null ? null : IconCompat.eablkybsjg(bitmap);
            return this;
        }

        public zoijcleaow dxjokdxxww(Icon icon) {
            this.f8463gxszxtbevo = icon == null ? null : IconCompat.iobyxmoadg(icon);
            this.f8464lqeggnwhkg = true;
            return this;
        }

        public zoijcleaow nufgyqmvbu(Bitmap bitmap) {
            this.f8463gxszxtbevo = bitmap == null ? null : IconCompat.eablkybsjg(bitmap);
            this.f8464lqeggnwhkg = true;
            return this;
        }

        @Override // androidx.core.app.wflxmlrfwp.gxszxtbevo
        protected String ppxfxbqfkf() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.wflxmlrfwp.gxszxtbevo
        public void zoijcleaow(draadjrbmk draadjrbmkVar) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(draadjrbmkVar.iobyxmoadg()).setBigContentTitle(this.f8447zoijcleaow);
            IconCompat iconCompat = this.f8462eablkybsjg;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    C0133zoijcleaow.iobyxmoadg(bigContentTitle, this.f8462eablkybsjg.oxmwwwfdhm(draadjrbmkVar instanceof agtfadlqog ? ((agtfadlqog) draadjrbmkVar).gxszxtbevo() : null));
                } else if (iconCompat.draadjrbmk() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.f8462eablkybsjg.dxjokdxxww());
                }
            }
            if (this.f8464lqeggnwhkg) {
                if (this.f8463gxszxtbevo == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    iobyxmoadg.iobyxmoadg(bigContentTitle, this.f8463gxszxtbevo.oxmwwwfdhm(draadjrbmkVar instanceof agtfadlqog ? ((agtfadlqog) draadjrbmkVar).gxszxtbevo() : null));
                }
            }
            if (this.f8446wkgbmnqykc) {
                bigContentTitle.setSummaryText(this.f8445ppxfxbqfkf);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                C0133zoijcleaow.ppxfxbqfkf(bigContentTitle, this.f8461dxjokdxxww);
                C0133zoijcleaow.zoijcleaow(bigContentTitle, this.f8465nufgyqmvbu);
            }
        }
    }

    public static Bundle iobyxmoadg(Notification notification) {
        return notification.extras;
    }

    public static Bitmap zoijcleaow(Context context, Bitmap bitmap) {
        if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
            return bitmap;
        }
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(g1.zoijcleaow.compat_notification_large_icon_max_width);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(g1.zoijcleaow.compat_notification_large_icon_max_height);
        if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
            return bitmap;
        }
        double dMin = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
        return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dMin), (int) Math.ceil(((double) bitmap.getHeight()) * dMin), true);
    }

    public static class eablkybsjg {

        /* JADX INFO: renamed from: agtfadlqog, reason: collision with root package name */
        boolean f8397agtfadlqog;

        /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
        IconCompat f8398btonecajqb;

        /* JADX INFO: renamed from: cdpycssgdh, reason: collision with root package name */
        Bundle f8399cdpycssgdh;

        /* JADX INFO: renamed from: cllcsxoeiz, reason: collision with root package name */
        long f8400cllcsxoeiz;

        /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
        boolean f8401cqumvgiudr;

        /* JADX INFO: renamed from: draadjrbmk, reason: collision with root package name */
        int f8402draadjrbmk;

        /* JADX INFO: renamed from: dsvhmnatus, reason: collision with root package name */
        int f8403dsvhmnatus;

        /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
        RemoteViews f8404dxjokdxxww;

        /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
        CharSequence f8405eablkybsjg;

        /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
        String f8406esjtqupxsv;

        /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
        CharSequence f8407gtknphoqwx;

        /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
        CharSequence f8408gxszxtbevo;

        /* JADX INFO: renamed from: hcddaimhww, reason: collision with root package name */
        String f8409hcddaimhww;

        /* JADX INFO: renamed from: hkdspvbjdz, reason: collision with root package name */
        String f8410hkdspvbjdz;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public Context f8411iobyxmoadg;

        /* JADX INFO: renamed from: iozdgvuglv, reason: collision with root package name */
        int f8412iozdgvuglv;

        /* JADX INFO: renamed from: istkbnxepw, reason: collision with root package name */
        String f8413istkbnxepw;

        /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
        String f8414iwizpuwonk;

        /* JADX INFO: renamed from: jpowsppfya, reason: collision with root package name */
        int f8415jpowsppfya;

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        boolean f8416jyumaefscl;

        /* JADX INFO: renamed from: kcexrzcfyt, reason: collision with root package name */
        CharSequence[] f8417kcexrzcfyt;

        /* JADX INFO: renamed from: kegysxyocb, reason: collision with root package name */
        Notification f8418kegysxyocb;

        /* JADX INFO: renamed from: lereixgezr, reason: collision with root package name */
        boolean f8419lereixgezr;

        /* JADX INFO: renamed from: lmojexxdyd, reason: collision with root package name */
        Notification f8420lmojexxdyd;

        /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
        PendingIntent f8421lqeggnwhkg;

        /* JADX INFO: renamed from: mbcevpiqjq, reason: collision with root package name */
        Object f8422mbcevpiqjq;

        /* JADX INFO: renamed from: ntlheqmsrt, reason: collision with root package name */
        public ArrayList f8423ntlheqmsrt;

        /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
        PendingIntent f8424nufgyqmvbu;

        /* JADX INFO: renamed from: ojitshcjhn, reason: collision with root package name */
        boolean f8425ojitshcjhn;

        /* JADX INFO: renamed from: oxmwwwfdhm, reason: collision with root package name */
        CharSequence f8426oxmwwwfdhm;

        /* JADX INFO: renamed from: pkzmftpjix, reason: collision with root package name */
        RemoteViews f8427pkzmftpjix;

        /* JADX INFO: renamed from: pmvmpeiblj, reason: collision with root package name */
        boolean f8428pmvmpeiblj;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        public ArrayList f8429ppxfxbqfkf;

        /* JADX INFO: renamed from: rgvfuqvkyq, reason: collision with root package name */
        gxszxtbevo f8430rgvfuqvkyq;

        /* JADX INFO: renamed from: stevsuqkhv, reason: collision with root package name */
        boolean f8431stevsuqkhv;

        /* JADX INFO: renamed from: tzroggbefp, reason: collision with root package name */
        boolean f8432tzroggbefp;

        /* JADX INFO: renamed from: vdvldrhtss, reason: collision with root package name */
        CharSequence f8433vdvldrhtss;

        /* JADX INFO: renamed from: wflxmlrfwp, reason: collision with root package name */
        int f8434wflxmlrfwp;

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        ArrayList f8435wkgbmnqykc;

        /* JADX INFO: renamed from: wwaezpbzkn, reason: collision with root package name */
        RemoteViews f8436wwaezpbzkn;

        /* JADX INFO: renamed from: wypolnanlu, reason: collision with root package name */
        int f8437wypolnanlu;

        /* JADX INFO: renamed from: yadqdtsiqt, reason: collision with root package name */
        int f8438yadqdtsiqt;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        int f8439yggfygwlhe;

        /* JADX INFO: renamed from: ylkuphrtab, reason: collision with root package name */
        RemoteViews f8440ylkuphrtab;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        int f8441zdlpuopuiu;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public ArrayList f8442zoijcleaow;

        /* JADX INFO: renamed from: zynmafqrjb, reason: collision with root package name */
        boolean f8443zynmafqrjb;

        static class iobyxmoadg {
            static AudioAttributes iobyxmoadg(AudioAttributes.Builder builder) {
                return builder.build();
            }

            static AudioAttributes.Builder ppxfxbqfkf(AudioAttributes.Builder builder, int i13) {
                return builder.setContentType(i13);
            }

            static AudioAttributes.Builder wkgbmnqykc(AudioAttributes.Builder builder, int i13) {
                return builder.setUsage(i13);
            }

            static AudioAttributes.Builder zoijcleaow() {
                return new AudioAttributes.Builder();
            }
        }

        public eablkybsjg(Context context, String str) {
            this.f8442zoijcleaow = new ArrayList();
            this.f8429ppxfxbqfkf = new ArrayList();
            this.f8435wkgbmnqykc = new ArrayList();
            this.f8397agtfadlqog = true;
            this.f8419lereixgezr = false;
            this.f8438yadqdtsiqt = 0;
            this.f8412iozdgvuglv = 0;
            this.f8415jpowsppfya = 0;
            this.f8403dsvhmnatus = 0;
            this.f8437wypolnanlu = 0;
            Notification notification = new Notification();
            this.f8418kegysxyocb = notification;
            this.f8411iobyxmoadg = context;
            this.f8409hcddaimhww = str;
            notification.when = System.currentTimeMillis();
            this.f8418kegysxyocb.audioStreamType = -1;
            this.f8434wflxmlrfwp = 0;
            this.f8423ntlheqmsrt = new ArrayList();
            this.f8431stevsuqkhv = true;
        }

        private void wflxmlrfwp(int i13, boolean z13) {
            if (z13) {
                Notification notification = this.f8418kegysxyocb;
                notification.flags = i13 | notification.flags;
            } else {
                Notification notification2 = this.f8418kegysxyocb;
                notification2.flags = (~i13) & notification2.flags;
            }
        }

        protected static CharSequence wkgbmnqykc(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public eablkybsjg agtfadlqog(Bitmap bitmap) {
            this.f8398btonecajqb = bitmap == null ? null : IconCompat.eablkybsjg(wflxmlrfwp.zoijcleaow(this.f8411iobyxmoadg, bitmap));
            return this;
        }

        public eablkybsjg btonecajqb(CharSequence charSequence) {
            this.f8405eablkybsjg = wkgbmnqykc(charSequence);
            return this;
        }

        public eablkybsjg cqumvgiudr(long[] jArr) {
            this.f8418kegysxyocb.vibrate = jArr;
            return this;
        }

        public eablkybsjg draadjrbmk(PendingIntent pendingIntent) {
            this.f8418kegysxyocb.deleteIntent = pendingIntent;
            return this;
        }

        public eablkybsjg dxjokdxxww(CharSequence charSequence) {
            this.f8408gxszxtbevo = wkgbmnqykc(charSequence);
            return this;
        }

        public eablkybsjg eablkybsjg(boolean z13) {
            wflxmlrfwp(16, z13);
            return this;
        }

        public eablkybsjg esjtqupxsv(int i13) {
            this.f8412iozdgvuglv = i13;
            return this;
        }

        public eablkybsjg gtknphoqwx(int i13) {
            Notification notification = this.f8418kegysxyocb;
            notification.defaults = i13;
            if ((i13 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public eablkybsjg gxszxtbevo(String str) {
            this.f8409hcddaimhww = str;
            return this;
        }

        public eablkybsjg iobyxmoadg(int i13, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f8442zoijcleaow.add(new iobyxmoadg(i13, charSequence, pendingIntent));
            return this;
        }

        public eablkybsjg iwizpuwonk(CharSequence charSequence) {
            this.f8418kegysxyocb.tickerText = wkgbmnqykc(charSequence);
            return this;
        }

        public eablkybsjg jyumaefscl(gxszxtbevo gxszxtbevoVar) {
            if (this.f8430rgvfuqvkyq != gxszxtbevoVar) {
                this.f8430rgvfuqvkyq = gxszxtbevoVar;
                if (gxszxtbevoVar != null) {
                    gxszxtbevoVar.lqeggnwhkg(this);
                }
            }
            return this;
        }

        public eablkybsjg kcexrzcfyt(boolean z13) {
            this.f8397agtfadlqog = z13;
            return this;
        }

        public eablkybsjg lereixgezr(long j13) {
            this.f8418kegysxyocb.when = j13;
            return this;
        }

        public eablkybsjg lqeggnwhkg(int i13) {
            this.f8438yadqdtsiqt = i13;
            return this;
        }

        public eablkybsjg nufgyqmvbu(PendingIntent pendingIntent) {
            this.f8421lqeggnwhkg = pendingIntent;
            return this;
        }

        public eablkybsjg ojitshcjhn(int i13, int i14, int i15) {
            Notification notification = this.f8418kegysxyocb;
            notification.ledARGB = i13;
            notification.ledOnMS = i14;
            notification.ledOffMS = i15;
            notification.flags = ((i14 == 0 || i15 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public eablkybsjg oxmwwwfdhm(int i13) {
            this.f8434wflxmlrfwp = i13;
            return this;
        }

        public Bundle ppxfxbqfkf() {
            if (this.f8399cdpycssgdh == null) {
                this.f8399cdpycssgdh = new Bundle();
            }
            return this.f8399cdpycssgdh;
        }

        public eablkybsjg rgvfuqvkyq(boolean z13) {
            this.f8419lereixgezr = z13;
            return this;
        }

        public eablkybsjg vdvldrhtss(int i13) {
            this.f8402draadjrbmk = i13;
            return this;
        }

        public eablkybsjg yggfygwlhe(Uri uri) {
            Notification notification = this.f8418kegysxyocb;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder builderWkgbmnqykc = iobyxmoadg.wkgbmnqykc(iobyxmoadg.ppxfxbqfkf(iobyxmoadg.zoijcleaow(), 4), 5);
            this.f8418kegysxyocb.audioAttributes = iobyxmoadg.iobyxmoadg(builderWkgbmnqykc);
            return this;
        }

        public eablkybsjg zdlpuopuiu(int i13) {
            this.f8418kegysxyocb.icon = i13;
            return this;
        }

        public Notification zoijcleaow() {
            return new agtfadlqog(this).ppxfxbqfkf();
        }

        public eablkybsjg(Context context) {
            this(context, null);
        }
    }
}
