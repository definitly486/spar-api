package zd;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iobyxmoadg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private static final TimeZone f129667iobyxmoadg = TimeZone.getTimeZone("UTC");

    private static boolean iobyxmoadg(String str, int i13, char c13) {
        return i13 < str.length() && str.charAt(i13) == c13;
    }

    /* JADX WARN: Code duplicated, block: B:85:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:91:0x01f5  */
    /* JADX WARN: Instruction removed from duplicated block: B:86:0x01d5, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:91:0x01f5, please report this as an issue */
    public static Date ppxfxbqfkf(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i13;
        int i14;
        int i15;
        int iWkgbmnqykc;
        int length;
        TimeZone timeZone;
        char cCharAt;
        try {
            int index = parsePosition.getIndex();
            int i16 = index + 4;
            int iWkgbmnqykc2 = wkgbmnqykc(str, index, i16);
            if (iobyxmoadg(str, i16, '-')) {
                i16 = index + 5;
            }
            int i17 = i16 + 2;
            int iWkgbmnqykc3 = wkgbmnqykc(str, i16, i17);
            if (iobyxmoadg(str, i17, '-')) {
                i17 = i16 + 3;
            }
            int i18 = i17 + 2;
            int iWkgbmnqykc4 = wkgbmnqykc(str, i17, i18);
            boolean zIobyxmoadg = iobyxmoadg(str, i18, 'T');
            if (!zIobyxmoadg && str.length() <= i18) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iWkgbmnqykc2, iWkgbmnqykc3 - 1, iWkgbmnqykc4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i18);
                return gregorianCalendar.getTime();
            }
            if (zIobyxmoadg) {
                int i19 = i17 + 5;
                int iWkgbmnqykc5 = wkgbmnqykc(str, i17 + 3, i19);
                if (iobyxmoadg(str, i19, ':')) {
                    i19 = i17 + 6;
                }
                int i23 = i19 + 2;
                int iWkgbmnqykc6 = wkgbmnqykc(str, i19, i23);
                if (iobyxmoadg(str, i23, ':')) {
                    i23 = i19 + 3;
                }
                if (str.length() <= i23 || (cCharAt = str.charAt(i23)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    i14 = iWkgbmnqykc6;
                    i15 = 0;
                    iWkgbmnqykc = 0;
                    i18 = i23;
                    i13 = iWkgbmnqykc5;
                } else {
                    int i24 = i23 + 2;
                    iWkgbmnqykc = wkgbmnqykc(str, i23, i24);
                    if (iWkgbmnqykc > 59 && iWkgbmnqykc < 63) {
                        iWkgbmnqykc = 59;
                    }
                    if (iobyxmoadg(str, i24, '.')) {
                        int i25 = i23 + 3;
                        int iZoijcleaow = zoijcleaow(str, i23 + 4);
                        int iMin = Math.min(iZoijcleaow, i23 + 6);
                        int iWkgbmnqykc7 = wkgbmnqykc(str, i25, iMin);
                        int i26 = iMin - i25;
                        if (i26 == 1) {
                            iWkgbmnqykc7 *= 100;
                        } else if (i26 == 2) {
                            iWkgbmnqykc7 *= 10;
                        }
                        i13 = iWkgbmnqykc5;
                        i18 = iZoijcleaow;
                        i14 = iWkgbmnqykc6;
                        i15 = iWkgbmnqykc7;
                    } else {
                        i13 = iWkgbmnqykc5;
                        i18 = i24;
                        i14 = iWkgbmnqykc6;
                        i15 = 0;
                    }
                }
            } else {
                i13 = 0;
                i14 = 0;
                i15 = 0;
                iWkgbmnqykc = 0;
            }
            if (str.length() <= i18) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt2 = str.charAt(i18);
            if (cCharAt2 == 'Z') {
                timeZone = f129667iobyxmoadg;
                length = i18 + 1;
            } else {
                if (cCharAt2 != '+' && cCharAt2 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt2 + "'");
                }
                String strSubstring = str.substring(i18);
                if (strSubstring.length() < 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i18 + strSubstring.length();
                if ("+0000".equals(strSubstring) || "+00:00".equals(strSubstring)) {
                    timeZone = f129667iobyxmoadg;
                } else {
                    String str3 = "GMT" + strSubstring;
                    TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                    String id2 = timeZone2.getID();
                    if (!id2.equals(str3) && !id2.replace(StringUtils.PROCESS_POSTFIX_DELIMITER, "").equals(str3)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                    }
                    timeZone = timeZone2;
                }
            }
            GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
            gregorianCalendar2.setLenient(false);
            gregorianCalendar2.set(1, iWkgbmnqykc2);
            gregorianCalendar2.set(2, iWkgbmnqykc3 - 1);
            gregorianCalendar2.set(5, iWkgbmnqykc4);
            gregorianCalendar2.set(11, i13);
            gregorianCalendar2.set(12, i14);
            gregorianCalendar2.set(13, iWkgbmnqykc);
            gregorianCalendar2.set(14, i15);
            parsePosition.setIndex(length);
            return gregorianCalendar2.getTime();
        } catch (IndexOutOfBoundsException e13) {
            e = e13;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (NumberFormatException e14) {
            e = e14;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        } catch (IllegalArgumentException e15) {
            e = e15;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = "(" + e.getClass().getName() + ")";
            } else {
                message = "(" + e.getClass().getName() + ")";
            }
            ParseException parseException3 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException3.initCause(e);
            throw parseException3;
        }
    }

    private static int wkgbmnqykc(String str, int i13, int i14) {
        int i15;
        int i16;
        if (i13 < 0 || i14 > str.length() || i13 > i14) {
            throw new NumberFormatException(str);
        }
        if (i13 < i14) {
            i16 = i13 + 1;
            int iDigit = Character.digit(str.charAt(i13), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i13, i14));
            }
            i15 = -iDigit;
        } else {
            i15 = 0;
            i16 = i13;
        }
        while (i16 < i14) {
            int i17 = i16 + 1;
            int iDigit2 = Character.digit(str.charAt(i16), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i13, i14));
            }
            i15 = (i15 * 10) - iDigit2;
            i16 = i17;
        }
        return -i15;
    }

    private static int zoijcleaow(String str, int i13) {
        while (i13 < str.length()) {
            char cCharAt = str.charAt(i13);
            if (cCharAt < '0' || cCharAt > '9') {
                return i13;
            }
            i13++;
        }
        return str.length();
    }
}
