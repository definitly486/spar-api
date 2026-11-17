package l3;

import h4.nufgyqmvbu;

/* JADX INFO: loaded from: classes.dex */
public interface iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public static final iobyxmoadg f61380iobyxmoadg = new C1241iobyxmoadg();

    /* JADX INFO: renamed from: l3.iobyxmoadg$iobyxmoadg, reason: collision with other inner class name */
    class C1241iobyxmoadg implements iobyxmoadg {
        C1241iobyxmoadg() {
        }

        @Override // l3.iobyxmoadg
        public boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }

        @Override // l3.iobyxmoadg
        public c4.iobyxmoadg zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar) {
            String str = iobyxmoadgVar.f9769ojitshcjhn;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new d4.zoijcleaow();
                    case "application/x-icy":
                        return new g4.iobyxmoadg();
                    case "application/id3":
                        return new nufgyqmvbu();
                    case "application/x-emsg":
                        return new e4.zoijcleaow();
                    case "application/x-scte35":
                        return new j4.ppxfxbqfkf();
                }
            }
            throw new IllegalArgumentException("Attempted to create decoder for unsupported MIME type: " + str);
        }
    }

    boolean iobyxmoadg(androidx.media3.common.iobyxmoadg iobyxmoadgVar);

    c4.iobyxmoadg zoijcleaow(androidx.media3.common.iobyxmoadg iobyxmoadgVar);
}
