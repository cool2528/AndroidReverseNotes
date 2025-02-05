package com.tencent.p177mm.p230g.p711c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p177mm.sdk.p603e.C4925c;
import com.tencent.p177mm.sdk.p603e.C4925c.C4924a;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.g.c.et */
public abstract class C18478et extends C4925c {
    private static final int dBn = "totalSize".hashCode();
    private static final int dSf = "storyId".hashCode();
    private static final int dTg = "cacheSize".hashCode();
    public static final String[] diI = new String[0];
    private static final int diR = "rowid".hashCode();
    private static final int dnT = "url".hashCode();
    private static final int dsb = "filePath".hashCode();
    private boolean dAR = true;
    private boolean dRZ = true;
    private boolean dTf = true;
    private boolean dnP = true;
    private boolean drT = true;
    public int field_cacheSize;
    public String field_filePath;
    public long field_storyId;
    public int field_totalSize;
    public String field_url;

    /* renamed from: Hm */
    public static C4924a m28768Hm() {
        C4924a c4924a = new C4924a();
        c4924a.xDb = new Field[5];
        c4924a.columns = new String[6];
        StringBuilder stringBuilder = new StringBuilder();
        c4924a.columns[0] = "storyId";
        c4924a.xDd.put("storyId", "LONG PRIMARY KEY ");
        stringBuilder.append(" storyId LONG PRIMARY KEY ");
        stringBuilder.append(", ");
        c4924a.xDc = "storyId";
        c4924a.columns[1] = "url";
        c4924a.xDd.put("url", "TEXT");
        stringBuilder.append(" url TEXT");
        stringBuilder.append(", ");
        c4924a.columns[2] = "filePath";
        c4924a.xDd.put("filePath", "TEXT");
        stringBuilder.append(" filePath TEXT");
        stringBuilder.append(", ");
        c4924a.columns[3] = "totalSize";
        c4924a.xDd.put("totalSize", "INTEGER");
        stringBuilder.append(" totalSize INTEGER");
        stringBuilder.append(", ");
        c4924a.columns[4] = "cacheSize";
        c4924a.xDd.put("cacheSize", "INTEGER");
        stringBuilder.append(" cacheSize INTEGER");
        c4924a.columns[5] = "rowid";
        c4924a.sql = stringBuilder.toString();
        return c4924a;
    }

    /* renamed from: d */
    public final void mo8995d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (dSf == hashCode) {
                    this.field_storyId = cursor.getLong(i);
                    this.dRZ = true;
                } else if (dnT == hashCode) {
                    this.field_url = cursor.getString(i);
                } else if (dsb == hashCode) {
                    this.field_filePath = cursor.getString(i);
                } else if (dBn == hashCode) {
                    this.field_totalSize = cursor.getInt(i);
                } else if (dTg == hashCode) {
                    this.field_cacheSize = cursor.getInt(i);
                } else if (diR == hashCode) {
                    this.xDa = cursor.getLong(i);
                }
            }
        }
    }

    /* renamed from: Hl */
    public final ContentValues mo10098Hl() {
        ContentValues contentValues = new ContentValues();
        if (this.dRZ) {
            contentValues.put("storyId", Long.valueOf(this.field_storyId));
        }
        if (this.dnP) {
            contentValues.put("url", this.field_url);
        }
        if (this.drT) {
            contentValues.put("filePath", this.field_filePath);
        }
        if (this.dAR) {
            contentValues.put("totalSize", Integer.valueOf(this.field_totalSize));
        }
        if (this.dTf) {
            contentValues.put("cacheSize", Integer.valueOf(this.field_cacheSize));
        }
        if (this.xDa > 0) {
            contentValues.put("rowid", Long.valueOf(this.xDa));
        }
        return contentValues;
    }
}
