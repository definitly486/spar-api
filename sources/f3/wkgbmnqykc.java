package f3;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.wizcaqwiak;
import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class wkgbmnqykc implements jpowsppfya {

    /* JADX INFO: renamed from: btonecajqb, reason: collision with root package name */
    private boolean f32693btonecajqb;

    /* JADX INFO: renamed from: dxjokdxxww, reason: collision with root package name */
    private boolean f32694dxjokdxxww;

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f32695eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Context f32698iobyxmoadg;

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private boolean f32699lqeggnwhkg;

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private boolean f32700nufgyqmvbu;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final androidx.media3.exoplayer.mediacodec.lqeggnwhkg f32703zoijcleaow;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private int f32701ppxfxbqfkf = 0;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private long f32702wkgbmnqykc = DeviceOrientationRequest.OUTPUT_PERIOD_FAST;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private androidx.media3.exoplayer.mediacodec.draadjrbmk f32697gxszxtbevo = androidx.media3.exoplayer.mediacodec.draadjrbmk.f10812iobyxmoadg;

    /* JADX INFO: renamed from: gtknphoqwx, reason: collision with root package name */
    private long f32696gtknphoqwx = -9223372036854775807L;

    public wkgbmnqykc(Context context) {
        this.f32698iobyxmoadg = context;
        this.f32703zoijcleaow = new androidx.media3.exoplayer.mediacodec.lqeggnwhkg(context);
    }

    protected void btonecajqb(Context context, n3.nufgyqmvbu nufgyqmvbuVar, Looper looper, int i13, ArrayList arrayList) {
        arrayList.add(new n3.dxjokdxxww(nufgyqmvbuVar, looper));
    }

    protected androidx.media3.exoplayer.mediacodec.nufgyqmvbu.zoijcleaow draadjrbmk() {
        return this.f32703zoijcleaow;
    }

    protected wizcaqwiak dxjokdxxww(wizcaqwiak wizcaqwiakVar, Context context, int i13, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, boolean z13, Handler handler, androidx.media3.exoplayer.video.wflxmlrfwp wflxmlrfwpVar, long j13) {
        if (this.f32694dxjokdxxww && wizcaqwiakVar.getClass() == androidx.media3.exoplayer.video.nufgyqmvbu.class) {
            return new androidx.media3.exoplayer.video.nufgyqmvbu.wkgbmnqykc(context).vdvldrhtss(draadjrbmk()).jyumaefscl(draadjrbmkVar).rgvfuqvkyq(j13).oxmwwwfdhm(z13).kcexrzcfyt(handler).zdlpuopuiu(wflxmlrfwpVar).yggfygwlhe(50).ojitshcjhn(this.f32693btonecajqb).agtfadlqog(this.f32696gtknphoqwx).wflxmlrfwp();
        }
        return null;
    }

    protected void eablkybsjg(Context context, int i13, ArrayList arrayList) {
        arrayList.add(new s3.zoijcleaow());
    }

    protected void gtknphoqwx(Context context, int i13, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, boolean z13, Handler handler, androidx.media3.exoplayer.video.wflxmlrfwp wflxmlrfwpVar, long j13, ArrayList arrayList) {
        int i14;
        int i15;
        arrayList.add(new androidx.media3.exoplayer.video.nufgyqmvbu.wkgbmnqykc(context).vdvldrhtss(draadjrbmk()).jyumaefscl(draadjrbmkVar).rgvfuqvkyq(j13).oxmwwwfdhm(z13).kcexrzcfyt(handler).zdlpuopuiu(wflxmlrfwpVar).yggfygwlhe(50).ojitshcjhn(this.f32693btonecajqb).agtfadlqog(this.f32696gtknphoqwx).wflxmlrfwp());
        if (i13 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i13 == 2) {
            size--;
        }
        try {
            try {
                i14 = size + 1;
                try {
                    arrayList.add(size, (wizcaqwiak) Class.forName("androidx.media3.decoder.vp9.LibvpxVideoRenderer").getConstructor(Long.TYPE, Handler.class, androidx.media3.exoplayer.video.wflxmlrfwp.class, Integer.TYPE).newInstance(Long.valueOf(j13), handler, wflxmlrfwpVar, 50));
                    y2.kcexrzcfyt.gxszxtbevo("DefaultRenderersFactory", "Loaded LibvpxVideoRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i14;
                    i14 = size;
                }
            } catch (ClassNotFoundException unused2) {
            }
            try {
                try {
                    i15 = i14 + 1;
                    try {
                        arrayList.add(i14, (wizcaqwiak) Class.forName("androidx.media3.decoder.av1.Libgav1VideoRenderer").getConstructor(Long.TYPE, Handler.class, androidx.media3.exoplayer.video.wflxmlrfwp.class, Integer.TYPE).newInstance(Long.valueOf(j13), handler, wflxmlrfwpVar, 50));
                        y2.kcexrzcfyt.gxszxtbevo("DefaultRenderersFactory", "Loaded Libgav1VideoRenderer.");
                    } catch (ClassNotFoundException unused3) {
                        i14 = i15;
                        i15 = i14;
                    }
                } catch (ClassNotFoundException unused4) {
                }
                try {
                    arrayList.add(i15, (wizcaqwiak) Class.forName("androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer").getConstructor(Long.TYPE, Handler.class, androidx.media3.exoplayer.video.wflxmlrfwp.class, Integer.TYPE).newInstance(Long.valueOf(j13), handler, wflxmlrfwpVar, 50));
                    y2.kcexrzcfyt.gxszxtbevo("DefaultRenderersFactory", "Loaded FfmpegVideoRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e13) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e13);
                }
            } catch (Exception e14) {
                throw new IllegalStateException("Error instantiating AV1 extension", e14);
            }
        } catch (Exception e15) {
            throw new IllegalStateException("Error instantiating VP9 extension", e15);
        }
    }

    protected void gxszxtbevo(ArrayList arrayList) {
        arrayList.add(new j3.eablkybsjg(wflxmlrfwp(), null));
    }

    @Override // f3.jpowsppfya
    public wizcaqwiak[] iobyxmoadg(Handler handler, androidx.media3.exoplayer.video.wflxmlrfwp wflxmlrfwpVar, androidx.media3.exoplayer.audio.eablkybsjg eablkybsjgVar, n3.nufgyqmvbu nufgyqmvbuVar, l3.zoijcleaow zoijcleaowVar) {
        ArrayList arrayList = new ArrayList();
        gtknphoqwx(this.f32698iobyxmoadg, this.f32701ppxfxbqfkf, this.f32697gxszxtbevo, this.f32695eablkybsjg, handler, wflxmlrfwpVar, this.f32702wkgbmnqykc, arrayList);
        AudioSink audioSinkWkgbmnqykc = wkgbmnqykc(this.f32698iobyxmoadg, this.f32699lqeggnwhkg, this.f32700nufgyqmvbu);
        if (audioSinkWkgbmnqykc != null) {
            ppxfxbqfkf(this.f32698iobyxmoadg, this.f32701ppxfxbqfkf, this.f32697gxszxtbevo, this.f32695eablkybsjg, audioSinkWkgbmnqykc, handler, eablkybsjgVar, arrayList);
        }
        btonecajqb(this.f32698iobyxmoadg, nufgyqmvbuVar, handler.getLooper(), this.f32701ppxfxbqfkf, arrayList);
        lqeggnwhkg(this.f32698iobyxmoadg, zoijcleaowVar, handler.getLooper(), this.f32701ppxfxbqfkf, arrayList);
        eablkybsjg(this.f32698iobyxmoadg, this.f32701ppxfxbqfkf, arrayList);
        gxszxtbevo(arrayList);
        nufgyqmvbu(this.f32698iobyxmoadg, handler, this.f32701ppxfxbqfkf, arrayList);
        return (wizcaqwiak[]) arrayList.toArray(new wizcaqwiak[0]);
    }

    protected void lqeggnwhkg(Context context, l3.zoijcleaow zoijcleaowVar, Looper looper, int i13, ArrayList arrayList) {
        arrayList.add(new l3.ppxfxbqfkf(zoijcleaowVar, looper));
        arrayList.add(new l3.ppxfxbqfkf(zoijcleaowVar, looper));
    }

    protected void nufgyqmvbu(Context context, Handler handler, int i13, ArrayList arrayList) {
    }

    protected void ppxfxbqfkf(Context context, int i13, androidx.media3.exoplayer.mediacodec.draadjrbmk draadjrbmkVar, boolean z13, AudioSink audioSink, Handler handler, androidx.media3.exoplayer.audio.eablkybsjg eablkybsjgVar, ArrayList arrayList) {
        AudioSink audioSink2;
        Handler handler2;
        Class cls;
        Class cls2;
        Class cls3;
        String str;
        Context context2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        arrayList.add(new androidx.media3.exoplayer.audio.wflxmlrfwp(context, draadjrbmk(), draadjrbmkVar, z13, handler, eablkybsjgVar, audioSink));
        if (i13 == 0) {
            return;
        }
        int size = arrayList.size();
        if (i13 == 2) {
            size--;
        }
        try {
            try {
                audioSink2 = audioSink;
                handler2 = handler;
                cls = Handler.class;
                cls2 = androidx.media3.exoplayer.audio.eablkybsjg.class;
                cls3 = AudioSink.class;
                context2 = context;
                try {
                    i14 = size + 1;
                    try {
                        arrayList.add(size, (wizcaqwiak) Class.forName("androidx.media3.decoder.midi.MidiRenderer").getConstructor(Context.class, Handler.class, androidx.media3.exoplayer.audio.eablkybsjg.class, AudioSink.class).newInstance(context2, handler2, eablkybsjgVar, audioSink2));
                        str = "DefaultRenderersFactory";
                        try {
                            y2.kcexrzcfyt.gxszxtbevo(str, "Loaded MidiRenderer.");
                        } catch (ClassNotFoundException unused) {
                            size = i14;
                            i14 = size;
                        }
                    } catch (ClassNotFoundException unused2) {
                        str = "DefaultRenderersFactory";
                    }
                } catch (ClassNotFoundException unused3) {
                    str = "DefaultRenderersFactory";
                }
            } catch (Exception e13) {
                throw new IllegalStateException("Error instantiating MIDI extension", e13);
            }
        } catch (ClassNotFoundException unused4) {
            audioSink2 = audioSink;
            handler2 = handler;
            cls = Handler.class;
            cls2 = androidx.media3.exoplayer.audio.eablkybsjg.class;
            cls3 = AudioSink.class;
            str = "DefaultRenderersFactory";
            context2 = context;
        }
        try {
            try {
                i15 = i14 + 1;
                try {
                    arrayList.add(i14, (wizcaqwiak) Class.forName("androidx.media3.decoder.opus.LibopusAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, eablkybsjgVar, audioSink2));
                    y2.kcexrzcfyt.gxszxtbevo(str, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                    i14 = i15;
                    i15 = i14;
                }
            } catch (ClassNotFoundException unused6) {
            }
            try {
                try {
                    i16 = i15 + 1;
                    try {
                        arrayList.add(i15, (wizcaqwiak) Class.forName("androidx.media3.decoder.flac.LibflacAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, eablkybsjgVar, audioSink2));
                        y2.kcexrzcfyt.gxszxtbevo(str, "Loaded LibflacAudioRenderer.");
                    } catch (ClassNotFoundException unused7) {
                        i15 = i16;
                        i16 = i15;
                    }
                } catch (ClassNotFoundException unused8) {
                }
                try {
                    try {
                        i17 = i16 + 1;
                        try {
                            arrayList.add(i16, (wizcaqwiak) Class.forName("androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, eablkybsjgVar, audioSink2));
                            y2.kcexrzcfyt.gxszxtbevo(str, "Loaded FfmpegAudioRenderer.");
                        } catch (ClassNotFoundException unused9) {
                            i16 = i17;
                            i17 = i16;
                        }
                    } catch (ClassNotFoundException unused10) {
                    }
                    try {
                        try {
                            i18 = i17 + 1;
                            try {
                                arrayList.add(i17, (wizcaqwiak) Class.forName("androidx.media3.decoder.iamf.LibiamfAudioRenderer").getConstructor(Context.class, cls, cls2, cls3).newInstance(context2, handler2, eablkybsjgVar, audioSink2));
                                y2.kcexrzcfyt.gxszxtbevo(str, "Loaded LibiamfAudioRenderer.");
                            } catch (ClassNotFoundException unused11) {
                                i17 = i18;
                                i18 = i17;
                            }
                        } catch (ClassNotFoundException unused12) {
                        }
                        try {
                            arrayList.add(i18, (wizcaqwiak) Class.forName("androidx.media3.decoder.mpegh.MpeghAudioRenderer").getConstructor(cls, cls2, cls3).newInstance(handler2, eablkybsjgVar, audioSink2));
                            y2.kcexrzcfyt.gxszxtbevo(str, "Loaded MpeghAudioRenderer.");
                        } catch (ClassNotFoundException unused13) {
                        } catch (Exception e14) {
                            throw new IllegalStateException("Error instantiating MPEG-H extension", e14);
                        }
                    } catch (Exception e15) {
                        throw new IllegalStateException("Error instantiating IAMF extension", e15);
                    }
                } catch (Exception e16) {
                    throw new IllegalStateException("Error instantiating FFmpeg extension", e16);
                }
            } catch (Exception e17) {
                throw new IllegalStateException("Error instantiating FLAC extension", e17);
            }
        } catch (Exception e18) {
            throw new IllegalStateException("Error instantiating Opus extension", e18);
        }
    }

    protected j3.ppxfxbqfkf.iobyxmoadg wflxmlrfwp() {
        return j3.ppxfxbqfkf.iobyxmoadg.f50602iobyxmoadg;
    }

    protected AudioSink wkgbmnqykc(Context context, boolean z13, boolean z14) {
        return new DefaultAudioSink.lqeggnwhkg(context).draadjrbmk(z13).gtknphoqwx(z14).btonecajqb();
    }

    @Override // f3.jpowsppfya
    public wizcaqwiak zoijcleaow(wizcaqwiak wizcaqwiakVar, Handler handler, androidx.media3.exoplayer.video.wflxmlrfwp wflxmlrfwpVar, androidx.media3.exoplayer.audio.eablkybsjg eablkybsjgVar, n3.nufgyqmvbu nufgyqmvbuVar, l3.zoijcleaow zoijcleaowVar) {
        if (wizcaqwiakVar.dxjokdxxww() == 2) {
            return dxjokdxxww(wizcaqwiakVar, this.f32698iobyxmoadg, this.f32701ppxfxbqfkf, this.f32697gxszxtbevo, this.f32695eablkybsjg, handler, wflxmlrfwpVar, this.f32702wkgbmnqykc);
        }
        return null;
    }
}
