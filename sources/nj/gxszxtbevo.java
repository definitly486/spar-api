package nj;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
abstract class gxszxtbevo extends eablkybsjg {
    public static final wkgbmnqykc eablkybsjg(String shortName) {
        zdlpuopuiu.btonecajqb(shortName, "shortName");
        int iHashCode = shortName.hashCode();
        if (iHashCode != 100) {
            if (iHashCode != 104) {
                if (iHashCode != 109) {
                    if (iHashCode != 115) {
                        if (iHashCode != 3494) {
                            if (iHashCode != 3525) {
                                if (iHashCode == 3742 && shortName.equals("us")) {
                                    return wkgbmnqykc.MICROSECONDS;
                                }
                            } else if (shortName.equals("ns")) {
                                return wkgbmnqykc.NANOSECONDS;
                            }
                        } else if (shortName.equals("ms")) {
                            return wkgbmnqykc.MILLISECONDS;
                        }
                    } else if (shortName.equals("s")) {
                        return wkgbmnqykc.SECONDS;
                    }
                } else if (shortName.equals("m")) {
                    return wkgbmnqykc.MINUTES;
                }
            } else if (shortName.equals("h")) {
                return wkgbmnqykc.HOURS;
            }
        } else if (shortName.equals("d")) {
            return wkgbmnqykc.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }

    public static final wkgbmnqykc wkgbmnqykc(char c13, boolean z13) {
        if (!z13) {
            if (c13 == 'D') {
                return wkgbmnqykc.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c13);
        }
        if (c13 == 'H') {
            return wkgbmnqykc.HOURS;
        }
        if (c13 == 'M') {
            return wkgbmnqykc.MINUTES;
        }
        if (c13 == 'S') {
            return wkgbmnqykc.SECONDS;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c13);
    }
}
