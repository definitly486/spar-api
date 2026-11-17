package cdpycssgdh;

import android.location.Location;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import lereixgezr.sopmlzcsov;

/* JADX INFO: loaded from: classes.dex */
public final class gxszxtbevo {

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private static final String f19698ppxfxbqfkf = "gxszxtbevo";

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final androidx.exifinterface.media.iobyxmoadg f19700iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private boolean f19701zoijcleaow = false;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    private static final ThreadLocal f19699wkgbmnqykc = new iobyxmoadg();

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    private static final ThreadLocal f19694eablkybsjg = new zoijcleaow();

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    private static final ThreadLocal f19695gxszxtbevo = new ppxfxbqfkf();

    /* JADX INFO: renamed from: lqeggnwhkg, reason: collision with root package name */
    private static final List f19696lqeggnwhkg = dxjokdxxww();

    /* JADX INFO: renamed from: nufgyqmvbu, reason: collision with root package name */
    private static final List f19697nufgyqmvbu = Arrays.asList("ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation");

    class iobyxmoadg extends ThreadLocal {
        iobyxmoadg() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class ppxfxbqfkf extends ThreadLocal {
        ppxfxbqfkf() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private static final class wkgbmnqykc {

        static final class iobyxmoadg {

            /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
            final double f19702iobyxmoadg;

            iobyxmoadg(double d13) {
                this.f19702iobyxmoadg = d13;
            }

            double iobyxmoadg() {
                return this.f19702iobyxmoadg / 2.23694d;
            }
        }

        static iobyxmoadg iobyxmoadg(double d13) {
            return new iobyxmoadg(d13 * 0.621371d);
        }

        static iobyxmoadg ppxfxbqfkf(double d13) {
            return new iobyxmoadg(d13);
        }

        static iobyxmoadg zoijcleaow(double d13) {
            return new iobyxmoadg(d13 * 1.15078d);
        }
    }

    class zoijcleaow extends ThreadLocal {
        zoijcleaow() {
        }

        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    private gxszxtbevo(androidx.exifinterface.media.iobyxmoadg iobyxmoadgVar) {
        this.f19700iobyxmoadg = iobyxmoadgVar;
    }

    public static List dxjokdxxww() {
        return Arrays.asList("ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType");
    }

    public static gxszxtbevo eablkybsjg(File file) {
        return gxszxtbevo(file.toString());
    }

    public static gxszxtbevo gxszxtbevo(String str) {
        return new gxszxtbevo(new androidx.exifinterface.media.iobyxmoadg(str));
    }

    private static Date iobyxmoadg(String str) {
        return ((SimpleDateFormat) f19699wkgbmnqykc.get()).parse(str);
    }

    private long kcexrzcfyt(String str) {
        if (str == null) {
            return -1L;
        }
        try {
            return zoijcleaow(str).getTime();
        } catch (ParseException unused) {
            return -1L;
        }
    }

    public static gxszxtbevo lqeggnwhkg(androidx.camera.core.agtfadlqog agtfadlqogVar) {
        ByteBuffer byteBufferZoijcleaow = agtfadlqogVar.eslsurpljm()[0].zoijcleaow();
        byteBufferZoijcleaow.rewind();
        byte[] bArr = new byte[byteBufferZoijcleaow.capacity()];
        byteBufferZoijcleaow.get(bArr);
        return nufgyqmvbu(new ByteArrayInputStream(bArr));
    }

    public static gxszxtbevo nufgyqmvbu(InputStream inputStream) {
        return new gxszxtbevo(new androidx.exifinterface.media.iobyxmoadg(inputStream));
    }

    private static Date ppxfxbqfkf(String str) {
        return ((SimpleDateFormat) f19694eablkybsjg.get()).parse(str);
    }

    private long zdlpuopuiu(String str, String str2) {
        if (str == null && str2 == null) {
            return -1L;
        }
        if (str2 == null) {
            try {
                return iobyxmoadg(str).getTime();
            } catch (ParseException unused) {
                return -1L;
            }
        }
        if (str == null) {
            try {
                return ppxfxbqfkf(str2).getTime();
            } catch (ParseException unused2) {
                return -1L;
            }
        }
        return kcexrzcfyt(str + " " + str2);
    }

    private static Date zoijcleaow(String str) {
        return ((SimpleDateFormat) f19695gxszxtbevo.get()).parse(str);
    }

    public int agtfadlqog() {
        switch (wflxmlrfwp()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public String btonecajqb() {
        return this.f19700iobyxmoadg.wkgbmnqykc("ImageDescription");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    public Location draadjrbmk() {
        byte b13;
        double dIobyxmoadg;
        String strWkgbmnqykc = this.f19700iobyxmoadg.wkgbmnqykc("GPSProcessingMethod");
        double[] dArrBtonecajqb = this.f19700iobyxmoadg.btonecajqb();
        double dPpxfxbqfkf = this.f19700iobyxmoadg.ppxfxbqfkf(0.0d);
        double dEablkybsjg = this.f19700iobyxmoadg.eablkybsjg("GPSSpeed", 0.0d);
        String strWkgbmnqykc2 = this.f19700iobyxmoadg.wkgbmnqykc("GPSSpeedRef");
        if (strWkgbmnqykc2 == null) {
            strWkgbmnqykc2 = "K";
        }
        long jZdlpuopuiu = zdlpuopuiu(this.f19700iobyxmoadg.wkgbmnqykc("GPSDateStamp"), this.f19700iobyxmoadg.wkgbmnqykc("GPSTimeStamp"));
        if (dArrBtonecajqb == null) {
            return null;
        }
        if (strWkgbmnqykc == null) {
            strWkgbmnqykc = f19698ppxfxbqfkf;
        }
        Location location = new Location(strWkgbmnqykc);
        location.setLatitude(dArrBtonecajqb[0]);
        location.setLongitude(dArrBtonecajqb[1]);
        if (dPpxfxbqfkf != 0.0d) {
            location.setAltitude(dPpxfxbqfkf);
        }
        if (dEablkybsjg != 0.0d) {
            int iHashCode = strWkgbmnqykc2.hashCode();
            if (iHashCode != 75) {
                if (iHashCode != 77) {
                    if (iHashCode == 78 && strWkgbmnqykc2.equals("N")) {
                        b13 = 1;
                    } else {
                        b13 = -1;
                    }
                } else if (strWkgbmnqykc2.equals("M")) {
                    b13 = 0;
                } else {
                    b13 = -1;
                }
            } else if (strWkgbmnqykc2.equals("K")) {
                b13 = 2;
            } else {
                b13 = -1;
            }
            if (b13 != 0) {
                dIobyxmoadg = b13 != 1 ? wkgbmnqykc.iobyxmoadg(dEablkybsjg).iobyxmoadg() : wkgbmnqykc.zoijcleaow(dEablkybsjg).iobyxmoadg();
            } else {
                dIobyxmoadg = wkgbmnqykc.ppxfxbqfkf(dEablkybsjg).iobyxmoadg();
            }
            location.setSpeed((float) dIobyxmoadg);
        }
        if (jZdlpuopuiu != -1) {
            location.setTime(jZdlpuopuiu);
        }
        return location;
    }

    public int gtknphoqwx() {
        return this.f19700iobyxmoadg.gxszxtbevo("ImageLength", 0);
    }

    public long ojitshcjhn() {
        long jKcexrzcfyt = kcexrzcfyt(this.f19700iobyxmoadg.wkgbmnqykc("DateTimeOriginal"));
        if (jKcexrzcfyt == -1) {
            return -1L;
        }
        String strWkgbmnqykc = this.f19700iobyxmoadg.wkgbmnqykc("SubSecTimeOriginal");
        if (strWkgbmnqykc == null) {
            return jKcexrzcfyt;
        }
        try {
            long j13 = Long.parseLong(strWkgbmnqykc);
            while (j13 > 1000) {
                j13 /= 10;
            }
            return jKcexrzcfyt + j13;
        } catch (NumberFormatException unused) {
            return jKcexrzcfyt;
        }
    }

    public boolean oxmwwwfdhm() {
        int iWflxmlrfwp = wflxmlrfwp();
        return iWflxmlrfwp == 4 || iWflxmlrfwp == 5 || iWflxmlrfwp == 7;
    }

    public int rgvfuqvkyq() {
        return this.f19700iobyxmoadg.gxszxtbevo("ImageWidth", 0);
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", Integer.valueOf(rgvfuqvkyq()), Integer.valueOf(gtknphoqwx()), Integer.valueOf(agtfadlqog()), Boolean.valueOf(oxmwwwfdhm()), Boolean.valueOf(vdvldrhtss()), draadjrbmk(), Long.valueOf(ojitshcjhn()), btonecajqb());
    }

    public boolean vdvldrhtss() {
        return wflxmlrfwp() == 2;
    }

    public int wflxmlrfwp() {
        return this.f19700iobyxmoadg.gxszxtbevo("Orientation", 0);
    }

    public void wkgbmnqykc(gxszxtbevo gxszxtbevoVar) {
        ArrayList<String> arrayList = new ArrayList(f19696lqeggnwhkg);
        arrayList.removeAll(f19697nufgyqmvbu);
        for (String str : arrayList) {
            String strWkgbmnqykc = this.f19700iobyxmoadg.wkgbmnqykc(str);
            String strWkgbmnqykc2 = gxszxtbevoVar.f19700iobyxmoadg.wkgbmnqykc(str);
            if (strWkgbmnqykc != null && !strWkgbmnqykc.equals(strWkgbmnqykc2)) {
                gxszxtbevoVar.f19700iobyxmoadg.kegysxyocb(str, strWkgbmnqykc);
            }
        }
    }

    public void yggfygwlhe(int i13) {
        if (i13 % 90 != 0) {
            sopmlzcsov.draadjrbmk(f19698ppxfxbqfkf, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", Integer.valueOf(i13)));
            this.f19700iobyxmoadg.kegysxyocb("Orientation", String.valueOf(0));
            return;
        }
        int i14 = i13 % 360;
        int iWflxmlrfwp = wflxmlrfwp();
        while (i14 < 0) {
            i14 += 90;
            switch (iWflxmlrfwp) {
                case 2:
                    iWflxmlrfwp = 5;
                    break;
                case 3:
                case 8:
                    iWflxmlrfwp = 6;
                    break;
                case 4:
                    iWflxmlrfwp = 7;
                    break;
                case 5:
                    iWflxmlrfwp = 4;
                    break;
                case 6:
                    iWflxmlrfwp = 1;
                    break;
                case 7:
                    iWflxmlrfwp = 2;
                    break;
                default:
                    iWflxmlrfwp = 8;
                    break;
            }
        }
        while (i14 > 0) {
            i14 -= 90;
            switch (iWflxmlrfwp) {
                case 2:
                    iWflxmlrfwp = 7;
                    break;
                case 3:
                    iWflxmlrfwp = 8;
                    break;
                case 4:
                    iWflxmlrfwp = 5;
                    break;
                case 5:
                    iWflxmlrfwp = 2;
                    break;
                case 6:
                    iWflxmlrfwp = 3;
                    break;
                case 7:
                    iWflxmlrfwp = 4;
                    break;
                case 8:
                    iWflxmlrfwp = 1;
                    break;
                default:
                    iWflxmlrfwp = 6;
                    break;
            }
        }
        this.f19700iobyxmoadg.kegysxyocb("Orientation", String.valueOf(iWflxmlrfwp));
    }
}
