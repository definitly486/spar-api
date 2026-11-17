package q4;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nufgyqmvbu implements oxmwwwfdhm.iobyxmoadg {
    @Override // q4.oxmwwwfdhm.iobyxmoadg
    public boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        return Objects.equals(str, "text/x-ssa") || Objects.equals(str, "text/vtt") || Objects.equals(str, "application/x-mp4-vtt") || Objects.equals(str, "application/x-subrip") || Objects.equals(str, "application/x-quicktime-tx3g") || Objects.equals(str, "application/pgs") || Objects.equals(str, "application/vobsub") || Objects.equals(str, "application/dvbsubs") || Objects.equals(str, "application/ttml+xml");
    }

    @Override // q4.oxmwwwfdhm.iobyxmoadg
    public oxmwwwfdhm ppxfxbqfkf(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new s4.iobyxmoadg(iobyxmoadgVar.f9770oxmwwwfdhm);
                case "application/pgs":
                    return new t4.iobyxmoadg();
                case "application/x-mp4-vtt":
                    return new z4.iobyxmoadg();
                case "text/vtt":
                    return new z4.lqeggnwhkg();
                case "application/x-quicktime-tx3g":
                    return new x4.iobyxmoadg(iobyxmoadgVar.f9770oxmwwwfdhm);
                case "text/x-ssa":
                    return new u4.zoijcleaow(iobyxmoadgVar.f9770oxmwwwfdhm);
                case "application/vobsub":
                    return new y4.iobyxmoadg(iobyxmoadgVar.f9770oxmwwwfdhm);
                case "application/x-subrip":
                    return new v4.iobyxmoadg();
                case "application/ttml+xml":
                    return new w4.wkgbmnqykc();
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }

    @Override // q4.oxmwwwfdhm.iobyxmoadg
    public int zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
        String str = iobyxmoadgVar.f9769ojitshcjhn;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException("Unsupported MIME type: " + str);
    }
}
