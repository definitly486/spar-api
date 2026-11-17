package org.xbill.DNS;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/* JADX INFO: loaded from: classes3.dex */
abstract class stevsuqkhv {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final DateTimeFormatter f74518iobyxmoadg = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneOffset.UTC);

    public static String iobyxmoadg(Instant instant) {
        return f74518iobyxmoadg.format(instant);
    }
}
