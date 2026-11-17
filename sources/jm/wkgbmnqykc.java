package jm;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.xbill.DNS.TextParseException;
import org.xbill.DNS.auzgnhcxok;
import org.xbill.DNS.gxszxtbevo;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc {

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final am.iobyxmoadg f51701gxszxtbevo = am.zoijcleaow.dxjokdxxww(wkgbmnqykc.class);

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private boolean f51702eablkybsjg;

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final Map f51703iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final boolean f51704ppxfxbqfkf;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private Instant f51705wkgbmnqykc;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final Path f51706zoijcleaow;

    private static final class iobyxmoadg {

        /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
        final int f51707iobyxmoadg;

        /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
        final Iterable f51708ppxfxbqfkf;

        /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
        final byte[] f51709zoijcleaow;

        public iobyxmoadg(int i13, byte[] bArr, Iterable iterable) {
            this.f51707iobyxmoadg = i13;
            this.f51709zoijcleaow = bArr;
            this.f51708ppxfxbqfkf = iterable;
        }
    }

    public wkgbmnqykc() {
        this(System.getProperty("os.name").contains("Windows") ? Paths.get(System.getenv("SystemRoot"), "\\System32\\drivers\\etc\\hosts") : Paths.get("/etc/hosts", new String[0]), true);
    }

    private void btonecajqb() {
        if (this.f51704ppxfxbqfkf) {
            Instant instant = Files.exists(this.f51706zoijcleaow, new LinkOption[0]) ? Files.getLastModifiedTime(this.f51706zoijcleaow, new LinkOption[0]).toInstant() : Instant.MAX;
            if (instant.isAfter(this.f51705wkgbmnqykc)) {
                if (!this.f51703iobyxmoadg.isEmpty()) {
                    f51701gxszxtbevo.vdvldrhtss("Local hosts database has changed at {}, clearing cache", instant);
                    this.f51703iobyxmoadg.clear();
                }
                this.f51702eablkybsjg = false;
                this.f51705wkgbmnqykc = instant;
            }
        }
    }

    private void dxjokdxxww(auzgnhcxok auzgnhcxokVar, int i13) throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.f51706zoijcleaow, StandardCharsets.UTF_8);
        int i14 = 0;
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    bufferedReaderNewBufferedReader.close();
                    return;
                }
                i14++;
                iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(i14, line);
                if (iobyxmoadgVarLqeggnwhkg != null) {
                    for (auzgnhcxok auzgnhcxokVar2 : iobyxmoadgVarLqeggnwhkg.f51708ppxfxbqfkf) {
                        if (auzgnhcxokVar2.equals(auzgnhcxokVar) && i13 == iobyxmoadgVarLqeggnwhkg.f51707iobyxmoadg) {
                            this.f51703iobyxmoadg.putIfAbsent(wkgbmnqykc(auzgnhcxokVar2, iobyxmoadgVarLqeggnwhkg.f51707iobyxmoadg), InetAddress.getByAddress(auzgnhcxokVar2.cdpycssgdh(true), iobyxmoadgVarLqeggnwhkg.f51709zoijcleaow));
                            bufferedReaderNewBufferedReader.close();
                            return;
                        }
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    if (bufferedReaderNewBufferedReader != null) {
                        try {
                            bufferedReaderNewBufferedReader.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    private void gxszxtbevo() throws IOException {
        BufferedReader bufferedReaderNewBufferedReader = Files.newBufferedReader(this.f51706zoijcleaow, StandardCharsets.UTF_8);
        int i13 = 0;
        while (true) {
            try {
                String line = bufferedReaderNewBufferedReader.readLine();
                if (line == null) {
                    bufferedReaderNewBufferedReader.close();
                    this.f51702eablkybsjg = true;
                    return;
                }
                i13++;
                iobyxmoadg iobyxmoadgVarLqeggnwhkg = lqeggnwhkg(i13, line);
                if (iobyxmoadgVarLqeggnwhkg != null) {
                    for (auzgnhcxok auzgnhcxokVar : iobyxmoadgVarLqeggnwhkg.f51708ppxfxbqfkf) {
                        this.f51703iobyxmoadg.putIfAbsent(wkgbmnqykc(auzgnhcxokVar, iobyxmoadgVarLqeggnwhkg.f51707iobyxmoadg), InetAddress.getByAddress(auzgnhcxokVar.cdpycssgdh(true), iobyxmoadgVarLqeggnwhkg.f51709zoijcleaow));
                    }
                }
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    if (bufferedReaderNewBufferedReader != null) {
                        try {
                            bufferedReaderNewBufferedReader.close();
                        } catch (Throwable th4) {
                            th2.addSuppressed(th4);
                        }
                    }
                    throw th3;
                }
            }
        }
    }

    private iobyxmoadg lqeggnwhkg(final int i13, String str) {
        String[] strArrPpxfxbqfkf = ppxfxbqfkf(str);
        if (strArrPpxfxbqfkf.length < 2) {
            return null;
        }
        int i14 = 1;
        byte[] bArrDxjokdxxww = gxszxtbevo.dxjokdxxww(strArrPpxfxbqfkf[0], 1);
        if (bArrDxjokdxxww == null) {
            bArrDxjokdxxww = gxszxtbevo.dxjokdxxww(strArrPpxfxbqfkf[0], 2);
            i14 = 28;
        }
        if (bArrDxjokdxxww == null) {
            f51701gxszxtbevo.btonecajqb("Could not decode address {}, {}#L{}", strArrPpxfxbqfkf[0], this.f51706zoijcleaow, Integer.valueOf(i13));
            return null;
        }
        final Stream streamFilter = Arrays.stream(strArrPpxfxbqfkf).skip(1L).map(new Function() { // from class: jm.iobyxmoadg
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f51698iobyxmoadg.eablkybsjg(i13, (String) obj);
            }
        }).filter(new Predicate() { // from class: jm.zoijcleaow
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((auzgnhcxok) obj);
            }
        });
        streamFilter.getClass();
        return new iobyxmoadg(i14, bArrDxjokdxxww, new Iterable() { // from class: jm.ppxfxbqfkf
            @Override // java.lang.Iterable
            public final Iterator iterator() {
                return streamFilter.iterator();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: nufgyqmvbu, reason: merged with bridge method [inline-methods] */
    public auzgnhcxok eablkybsjg(String str, int i13) {
        try {
            return auzgnhcxok.kcexrzcfyt(str, auzgnhcxok.f74233pmvmpeiblj);
        } catch (TextParseException unused) {
            f51701gxszxtbevo.btonecajqb("Could not decode name {}, {}#L{}, skipping", str, this.f51706zoijcleaow, Integer.valueOf(i13));
            return null;
        }
    }

    private String[] ppxfxbqfkf(String str) {
        int iIndexOf = str.indexOf(35);
        if (iIndexOf == -1) {
            iIndexOf = str.length();
        }
        return str.substring(0, iIndexOf).trim().split("\\s+");
    }

    private String wkgbmnqykc(auzgnhcxok auzgnhcxokVar, int i13) {
        return auzgnhcxokVar.toString() + '\t' + i13;
    }

    public synchronized Optional zoijcleaow(auzgnhcxok auzgnhcxokVar, int i13) {
        try {
            Objects.requireNonNull(auzgnhcxokVar, "name is required");
            if (i13 != 1 && i13 != 28) {
                throw new IllegalArgumentException("type can only be A or AAAA");
            }
            btonecajqb();
            InetAddress inetAddress = (InetAddress) this.f51703iobyxmoadg.get(wkgbmnqykc(auzgnhcxokVar, i13));
            if (inetAddress != null) {
                return Optional.of(inetAddress);
            }
            if (!this.f51702eablkybsjg && Files.exists(this.f51706zoijcleaow, new LinkOption[0])) {
                if (Files.size(this.f51706zoijcleaow) <= 16384) {
                    gxszxtbevo();
                } else {
                    dxjokdxxww(auzgnhcxokVar, i13);
                }
                return Optional.ofNullable(this.f51703iobyxmoadg.get(wkgbmnqykc(auzgnhcxokVar, i13)));
            }
            return Optional.empty();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public wkgbmnqykc(Path path, boolean z13) {
        this.f51703iobyxmoadg = new HashMap();
        this.f51705wkgbmnqykc = Instant.MIN;
        Objects.requireNonNull(path, "path is required");
        this.f51706zoijcleaow = path;
        this.f51704ppxfxbqfkf = z13;
        if (Files.isDirectory(path, new LinkOption[0])) {
            throw new IllegalArgumentException("path must be a file");
        }
    }
}
