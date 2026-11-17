package androidx.media3.exoplayer.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import android.util.Pair;
import android.util.SparseArray;
import com.google.common.collect.jyumaefscl;
import com.google.common.collect.ulzqkzuiru;
import com.google.common.collect.yggfygwlhe;
import com.google.common.collect.zdlpuopuiu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import v2.iwizpuwonk;
import y2.stevsuqkhv;

/* JADX INFO: loaded from: classes.dex */
public final class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final SparseArray f10237iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f10238zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    public static final iobyxmoadg f10235ppxfxbqfkf = new iobyxmoadg(zdlpuopuiu.istkbnxepw(eablkybsjg.f10239wkgbmnqykc));

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final zdlpuopuiu f10236wkgbmnqykc = zdlpuopuiu.yadqdtsiqt(2, 5, 6);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    static final yggfygwlhe f10234eablkybsjg = new yggfygwlhe.iobyxmoadg().gxszxtbevo(5, 6).gxszxtbevo(17, 6).gxszxtbevo(7, 6).gxszxtbevo(30, 10).gxszxtbevo(18, 6).gxszxtbevo(6, 8).gxszxtbevo(8, 8).gxszxtbevo(14, 8).ppxfxbqfkf();

    private static final class ppxfxbqfkf {
        public static zdlpuopuiu iobyxmoadg(v2.ppxfxbqfkf ppxfxbqfkfVar) {
            zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = zdlpuopuiu.kcexrzcfyt();
            ulzqkzuiru it = iobyxmoadg.f10234eablkybsjg.keySet().iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                int iIntValue = num.intValue();
                if (stevsuqkhv.f123602iobyxmoadg >= stevsuqkhv.pkzmftpjix(iIntValue) && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(iIntValue).setSampleRate(48000).build(), ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg)) {
                    iobyxmoadgVarKcexrzcfyt.iobyxmoadg(num);
                }
            }
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg(2);
            return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
        }

        public static int zoijcleaow(int i13, int i14, v2.ppxfxbqfkf ppxfxbqfkfVar) {
            for (int i15 = 10; i15 > 0; i15--) {
                int iJpowsppfya = stevsuqkhv.jpowsppfya(i15);
                if (iJpowsppfya != 0 && AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i14).setChannelMask(iJpowsppfya).build(), ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg)) {
                    return i15;
                }
            }
            return 0;
        }
    }

    private static final class wkgbmnqykc {
        public static iobyxmoadg iobyxmoadg(AudioManager audioManager, v2.ppxfxbqfkf ppxfxbqfkfVar) {
            return new iobyxmoadg(iobyxmoadg.ppxfxbqfkf(audioManager.getDirectProfilesForAttributes(ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg)));
        }

        public static androidx.media3.exoplayer.audio.ppxfxbqfkf zoijcleaow(AudioManager audioManager, v2.ppxfxbqfkf ppxfxbqfkfVar) {
            try {
                List audioDevicesForAttributes = ((AudioManager) y2.iobyxmoadg.eablkybsjg(audioManager)).getAudioDevicesForAttributes(ppxfxbqfkfVar.iobyxmoadg().f115673iobyxmoadg);
                if (audioDevicesForAttributes.isEmpty()) {
                    return null;
                }
                return new androidx.media3.exoplayer.audio.ppxfxbqfkf((AudioDeviceInfo) audioDevicesForAttributes.get(0));
            } catch (RuntimeException unused) {
                return null;
            }
        }
    }

    private static final class zoijcleaow {
        private static jyumaefscl iobyxmoadg() {
            jyumaefscl.iobyxmoadg iobyxmoadgVarDxjokdxxww = new jyumaefscl.iobyxmoadg().dxjokdxxww(8, 7);
            int i13 = stevsuqkhv.f123602iobyxmoadg;
            if (i13 >= 31) {
                iobyxmoadgVarDxjokdxxww.dxjokdxxww(26, 27);
            }
            if (i13 >= 33) {
                iobyxmoadgVarDxjokdxxww.iobyxmoadg(30);
            }
            return iobyxmoadgVarDxjokdxxww.draadjrbmk();
        }

        public static boolean zoijcleaow(AudioManager audioManager, androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar) {
            AudioDeviceInfo[] devices = ppxfxbqfkfVar == null ? ((AudioManager) y2.iobyxmoadg.eablkybsjg(audioManager)).getDevices(2) : new AudioDeviceInfo[]{ppxfxbqfkfVar.f10288iobyxmoadg};
            jyumaefscl jyumaefsclVarIobyxmoadg = iobyxmoadg();
            for (AudioDeviceInfo audioDeviceInfo : devices) {
                if (jyumaefsclVarIobyxmoadg.contains(Integer.valueOf(audioDeviceInfo.getType()))) {
                    return true;
                }
            }
            return false;
        }
    }

    static Uri dxjokdxxww() {
        if (zoijcleaow()) {
            return Settings.Global.getUriFor("external_surround_sound_enabled");
        }
        return null;
    }

    static iobyxmoadg eablkybsjg(Context context, Intent intent, v2.ppxfxbqfkf ppxfxbqfkfVar, androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar2) {
        AudioManager audioManagerPpxfxbqfkf = w2.eablkybsjg.ppxfxbqfkf(context);
        if (ppxfxbqfkfVar2 == null) {
            ppxfxbqfkfVar2 = stevsuqkhv.f123602iobyxmoadg >= 33 ? wkgbmnqykc.zoijcleaow(audioManagerPpxfxbqfkf, ppxfxbqfkfVar) : null;
        }
        int i13 = stevsuqkhv.f123602iobyxmoadg;
        if (i13 >= 33 && (stevsuqkhv.hszhottldk(context) || stevsuqkhv.auzgnhcxok(context))) {
            return wkgbmnqykc.iobyxmoadg(audioManagerPpxfxbqfkf, ppxfxbqfkfVar);
        }
        if (i13 >= 23 && zoijcleaow.zoijcleaow(audioManagerPpxfxbqfkf, ppxfxbqfkfVar2)) {
            return f10235ppxfxbqfkf;
        }
        jyumaefscl.iobyxmoadg iobyxmoadgVar = new jyumaefscl.iobyxmoadg();
        iobyxmoadgVar.iobyxmoadg(2);
        if (i13 >= 29 && (stevsuqkhv.hszhottldk(context) || stevsuqkhv.auzgnhcxok(context))) {
            iobyxmoadgVar.btonecajqb(ppxfxbqfkf.iobyxmoadg(ppxfxbqfkfVar));
            return new iobyxmoadg(wkgbmnqykc(com.google.common.primitives.gxszxtbevo.draadjrbmk(iobyxmoadgVar.draadjrbmk()), 10));
        }
        ContentResolver contentResolver = context.getContentResolver();
        boolean z13 = Settings.Global.getInt(contentResolver, "use_external_surround_sound_flag", 0) == 1;
        if ((z13 || zoijcleaow()) && Settings.Global.getInt(contentResolver, "external_surround_sound_enabled", 0) == 1) {
            iobyxmoadgVar.btonecajqb(f10236wkgbmnqykc);
        }
        if (intent == null || z13 || intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) != 1) {
            return new iobyxmoadg(wkgbmnqykc(com.google.common.primitives.gxszxtbevo.draadjrbmk(iobyxmoadgVar.draadjrbmk()), 10));
        }
        int[] intArrayExtra = intent.getIntArrayExtra("android.media.extra.ENCODINGS");
        if (intArrayExtra != null) {
            iobyxmoadgVar.btonecajqb(com.google.common.primitives.gxszxtbevo.ppxfxbqfkf(intArrayExtra));
        }
        return new iobyxmoadg(wkgbmnqykc(com.google.common.primitives.gxszxtbevo.draadjrbmk(iobyxmoadgVar.draadjrbmk()), intent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }

    static iobyxmoadg gxszxtbevo(Context context, v2.ppxfxbqfkf ppxfxbqfkfVar, androidx.media3.exoplayer.audio.ppxfxbqfkf ppxfxbqfkfVar2) {
        return eablkybsjg(context, context.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), ppxfxbqfkfVar, ppxfxbqfkfVar2);
    }

    private static int lqeggnwhkg(int i13) {
        int i14 = stevsuqkhv.f123602iobyxmoadg;
        if (i14 <= 28) {
            if (i13 == 7) {
                i13 = 8;
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                i13 = 6;
            }
        }
        if (i14 <= 26 && "fugu".equals(Build.DEVICE) && i13 == 1) {
            i13 = 2;
        }
        return stevsuqkhv.jpowsppfya(i13);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zdlpuopuiu ppxfxbqfkf(List list) {
        HashMap map = new HashMap();
        map.put(2, new HashSet(com.google.common.primitives.gxszxtbevo.ppxfxbqfkf(12)));
        for (int i13 = 0; i13 < list.size(); i13++) {
            AudioProfile audioProfileIobyxmoadg = h3.iobyxmoadg.iobyxmoadg(list.get(i13));
            if (audioProfileIobyxmoadg.getEncapsulationType() != 1) {
                int format = audioProfileIobyxmoadg.getFormat();
                if (stevsuqkhv.skhdrjzrfn(format) || f10234eablkybsjg.containsKey(Integer.valueOf(format))) {
                    if (map.containsKey(Integer.valueOf(format))) {
                        ((Set) y2.iobyxmoadg.eablkybsjg((Set) map.get(Integer.valueOf(format)))).addAll(com.google.common.primitives.gxszxtbevo.ppxfxbqfkf(audioProfileIobyxmoadg.getChannelMasks()));
                    } else {
                        map.put(Integer.valueOf(format), new HashSet(com.google.common.primitives.gxszxtbevo.ppxfxbqfkf(audioProfileIobyxmoadg.getChannelMasks())));
                    }
                }
            }
        }
        zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = zdlpuopuiu.kcexrzcfyt();
        for (Map.Entry entry : map.entrySet()) {
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new eablkybsjg(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
    }

    private static zdlpuopuiu wkgbmnqykc(int[] iArr, int i13) {
        zdlpuopuiu.iobyxmoadg iobyxmoadgVarKcexrzcfyt = zdlpuopuiu.kcexrzcfyt();
        if (iArr == null) {
            iArr = new int[0];
        }
        for (int i14 : iArr) {
            iobyxmoadgVarKcexrzcfyt.iobyxmoadg(new eablkybsjg(i14, i13));
        }
        return iobyxmoadgVarKcexrzcfyt.gtknphoqwx();
    }

    private static boolean zoijcleaow() {
        String str = Build.MANUFACTURER;
        return str.equals("Amazon") || str.equals("Xiaomi");
    }

    public boolean btonecajqb(androidx.media3.common.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar) {
        return nufgyqmvbu(iobyxmoadgVar, ppxfxbqfkfVar) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iobyxmoadg)) {
            return false;
        }
        iobyxmoadg iobyxmoadgVar = (iobyxmoadg) obj;
        return stevsuqkhv.kcexrzcfyt(this.f10237iobyxmoadg, iobyxmoadgVar.f10237iobyxmoadg) && this.f10238zoijcleaow == iobyxmoadgVar.f10238zoijcleaow;
    }

    public boolean gtknphoqwx(int i13) {
        return stevsuqkhv.vdvldrhtss(this.f10237iobyxmoadg, i13);
    }

    public int hashCode() {
        return this.f10238zoijcleaow + (stevsuqkhv.zdlpuopuiu(this.f10237iobyxmoadg) * 31);
    }

    public Pair nufgyqmvbu(androidx.media3.common.iobyxmoadg iobyxmoadgVar, v2.ppxfxbqfkf ppxfxbqfkfVar) {
        int iGxszxtbevo = iwizpuwonk.gxszxtbevo((String) y2.iobyxmoadg.eablkybsjg(iobyxmoadgVar.f9769ojitshcjhn), iobyxmoadgVar.f9754gtknphoqwx);
        if (!f10234eablkybsjg.containsKey(Integer.valueOf(iGxszxtbevo))) {
            return null;
        }
        if (iGxszxtbevo == 18 && !gtknphoqwx(18)) {
            iGxszxtbevo = 6;
        } else if ((iGxszxtbevo == 8 && !gtknphoqwx(8)) || (iGxszxtbevo == 30 && !gtknphoqwx(30))) {
            iGxszxtbevo = 7;
        }
        if (!gtknphoqwx(iGxszxtbevo)) {
            return null;
        }
        eablkybsjg eablkybsjgVar = (eablkybsjg) y2.iobyxmoadg.eablkybsjg((eablkybsjg) this.f10237iobyxmoadg.get(iGxszxtbevo));
        int iZoijcleaow = iobyxmoadgVar.f9779yadqdtsiqt;
        if (iZoijcleaow == -1 || iGxszxtbevo == 18) {
            int i13 = iobyxmoadgVar.f9759iozdgvuglv;
            if (i13 == -1) {
                i13 = 48000;
            }
            iZoijcleaow = eablkybsjgVar.zoijcleaow(i13, ppxfxbqfkfVar);
        } else if (!iobyxmoadgVar.f9769ojitshcjhn.equals("audio/vnd.dts.uhd;profile=p2") || stevsuqkhv.f123602iobyxmoadg >= 33) {
            if (!eablkybsjgVar.ppxfxbqfkf(iZoijcleaow)) {
                return null;
            }
        } else if (iZoijcleaow > 10) {
            return null;
        }
        int iLqeggnwhkg = lqeggnwhkg(iZoijcleaow);
        if (iLqeggnwhkg == 0) {
            return null;
        }
        return Pair.create(Integer.valueOf(iGxszxtbevo), Integer.valueOf(iLqeggnwhkg));
    }

    public String toString() {
        return "AudioCapabilities[maxChannelCount=" + this.f10238zoijcleaow + ", audioProfiles=" + this.f10237iobyxmoadg + "]";
    }

    private iobyxmoadg(List list) {
        this.f10237iobyxmoadg = new SparseArray();
        for (int i13 = 0; i13 < list.size(); i13++) {
            eablkybsjg eablkybsjgVar = (eablkybsjg) list.get(i13);
            this.f10237iobyxmoadg.put(eablkybsjgVar.f10240iobyxmoadg, eablkybsjgVar);
        }
        int iMax = 0;
        for (int i14 = 0; i14 < this.f10237iobyxmoadg.size(); i14++) {
            iMax = Math.max(iMax, ((eablkybsjg) this.f10237iobyxmoadg.valueAt(i14)).f10242zoijcleaow);
        }
        this.f10238zoijcleaow = iMax;
    }

    private static final class eablkybsjg {

        /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
        public static final eablkybsjg f10239wkgbmnqykc;

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        public final int f10240iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        private final jyumaefscl f10241ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        public final int f10242zoijcleaow;

        static {
            f10239wkgbmnqykc = stevsuqkhv.f123602iobyxmoadg >= 33 ? new eablkybsjg(2, iobyxmoadg(10)) : new eablkybsjg(2, 10);
        }

        public eablkybsjg(int i13, Set set) {
            this.f10240iobyxmoadg = i13;
            jyumaefscl jyumaefsclVarYggfygwlhe = jyumaefscl.yggfygwlhe(set);
            this.f10241ppxfxbqfkf = jyumaefsclVarYggfygwlhe;
            ulzqkzuiru it = jyumaefsclVarYggfygwlhe.iterator();
            int iMax = 0;
            while (it.hasNext()) {
                iMax = Math.max(iMax, Integer.bitCount(((Integer) it.next()).intValue()));
            }
            this.f10242zoijcleaow = iMax;
        }

        private static jyumaefscl iobyxmoadg(int i13) {
            jyumaefscl.iobyxmoadg iobyxmoadgVar = new jyumaefscl.iobyxmoadg();
            for (int i14 = 1; i14 <= i13; i14++) {
                iobyxmoadgVar.iobyxmoadg(Integer.valueOf(stevsuqkhv.jpowsppfya(i14)));
            }
            return iobyxmoadgVar.draadjrbmk();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof eablkybsjg)) {
                return false;
            }
            eablkybsjg eablkybsjgVar = (eablkybsjg) obj;
            return this.f10240iobyxmoadg == eablkybsjgVar.f10240iobyxmoadg && this.f10242zoijcleaow == eablkybsjgVar.f10242zoijcleaow && Objects.equals(this.f10241ppxfxbqfkf, eablkybsjgVar.f10241ppxfxbqfkf);
        }

        public int hashCode() {
            int i13 = ((this.f10240iobyxmoadg * 31) + this.f10242zoijcleaow) * 31;
            jyumaefscl jyumaefsclVar = this.f10241ppxfxbqfkf;
            return i13 + (jyumaefsclVar == null ? 0 : jyumaefsclVar.hashCode());
        }

        public boolean ppxfxbqfkf(int i13) {
            if (this.f10241ppxfxbqfkf == null) {
                return i13 <= this.f10242zoijcleaow;
            }
            int iJpowsppfya = stevsuqkhv.jpowsppfya(i13);
            if (iJpowsppfya == 0) {
                return false;
            }
            return this.f10241ppxfxbqfkf.contains(Integer.valueOf(iJpowsppfya));
        }

        public String toString() {
            return "AudioProfile[format=" + this.f10240iobyxmoadg + ", maxChannelCount=" + this.f10242zoijcleaow + ", channelMasks=" + this.f10241ppxfxbqfkf + "]";
        }

        public int zoijcleaow(int i13, v2.ppxfxbqfkf ppxfxbqfkfVar) {
            if (this.f10241ppxfxbqfkf != null) {
                return this.f10242zoijcleaow;
            }
            return stevsuqkhv.f123602iobyxmoadg >= 29 ? ppxfxbqfkf.zoijcleaow(this.f10240iobyxmoadg, i13, ppxfxbqfkfVar) : ((Integer) y2.iobyxmoadg.eablkybsjg((Integer) iobyxmoadg.f10234eablkybsjg.getOrDefault(Integer.valueOf(this.f10240iobyxmoadg), 0))).intValue();
        }

        public eablkybsjg(int i13, int i14) {
            this.f10240iobyxmoadg = i13;
            this.f10242zoijcleaow = i14;
            this.f10241ppxfxbqfkf = null;
        }
    }
}
