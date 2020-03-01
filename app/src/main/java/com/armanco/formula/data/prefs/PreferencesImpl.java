package com.armanco.formula.data.prefs;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferencesImpl implements Preferences {
    private final SharedPreferences mPrefs;

    private static final String PREF_KEY_SECTION_POSITION = "PREF_KEY_SECTION_POSITION";
    private static final String PREF_KEY_SUBSECTION_POSITION = "PREF_KEY_SUBSECTION_POSITION";

    public PreferencesImpl(Context context, String prefFileName) {
        mPrefs = context.getSharedPreferences(prefFileName, Context.MODE_PRIVATE);
    }

    @Override
    public int getPrefKeySectionPosition() {
        return Integer.parseInt(mPrefs.getString(PREF_KEY_SECTION_POSITION, null));
    }

    @Override
    public void setPrefKeySectionPosition(int position) {
        if(position!=0) mPrefs.edit().putString(PREF_KEY_SECTION_POSITION, String.valueOf(position)).apply();
        else mPrefs.edit().putString(PREF_KEY_SECTION_POSITION, null).apply();
    }
}
