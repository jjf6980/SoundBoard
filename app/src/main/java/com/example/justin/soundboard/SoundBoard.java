package com.example.justin.soundboard;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageButton;
import android.support.v4.app.FragmentActivity;
import android.widget.RelativeLayout;
import android.media.MediaRecorder;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.Inflater;



public class SoundBoard extends ActionBarActivity implements
        RecorderFragment.OnDataPass, RecorderFragment.OnFragmentInteractionListener
         {

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    ImageButton btn4;
    ImageButton btn5;
    ImageButton btn6;
    ImageButton temp;

    String audioData;
    String path1;
    String path2;
    String path3;
    String path4;
    String path5;
    String path6;

    int numb;

    FragmentManager fm = getFragmentManager();

    private static final int CONTENT_VIEW_ID = 10101010;

    FragmentTransaction fragmentTransaction = fm.beginTransaction();

    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
    private Uri fileUri;




    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sound_board);
        btn1 = (ImageButton)findViewById(R.id.btn1);
        btn2 = (ImageButton)findViewById(R.id.btn2);
        btn3 = (ImageButton)findViewById(R.id.btn3);
        btn4 = (ImageButton)findViewById(R.id.btn4);
        btn5 = (ImageButton)findViewById(R.id.btn5);
        btn6 = (ImageButton)findViewById(R.id.btn6);



        final ImageButton[] grid = {btn1,btn2,btn3,btn4,btn5,btn6};
       // final FrameLayout mLayout = (FrameLayout)findViewById(R.id.soundBoard);






        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder options = new AlertDialog.Builder(SoundBoard.this);
                options.setMessage("Message");
                options.setPositiveButton("Set Icon", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                        //fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
                        temp = (ImageButton) findViewById(R.id.btn1);
                    }
                });
                options.setNegativeButton("Set Audio", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //setContentView(R.layout.fragment_recorder2);
                        RecorderFragment rf = RecorderFragment.newInstance();

                        FragmentManager fm = getFragmentManager();

                        FragmentTransaction fragmentTransaction = fm.beginTransaction();

                        rf.btn = "1";

                        rf.num = 1;

                        fragmentTransaction.add(R.id.soundBoard, rf);

                        fragmentTransaction.addToBackStack(null);
                        //fragmentTransaction.remove(rf);

                        fragmentTransaction.commit();


                    }
                });
                options.show();
                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = new MediaPlayer();
                        try {
                            mp.setDataSource(path1);
                            mp.prepare();
                            mp.start();

                        } catch (Exception e) {

                        }
                        //btn1.setImageBitmap();


                    }
                });
                return true;
            }
        });
        btn2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder options = new AlertDialog.Builder(SoundBoard.this);
                options.setMessage("Message");
                options.setPositiveButton("Set Icon", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                        //fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
                        temp = (ImageButton) findViewById(R.id.btn2);
                    }
                });
                options.setNegativeButton("Set Audio", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //setContentView(R.layout.fragment_recorder2);
                        RecorderFragment rf = RecorderFragment.newInstance();

                        FragmentManager fm = getFragmentManager();

                        FragmentTransaction fragmentTransaction = fm.beginTransaction();

                        rf.btn = "2";

                        rf.num = 2;

                        fragmentTransaction.add(R.id.soundBoard, rf);

                        fragmentTransaction.addToBackStack(null);
                        //fragmentTransaction.remove(rf);

                        fragmentTransaction.commit();


                    }
                });
                options.show();
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = new MediaPlayer();
                        try {
                            mp.setDataSource(path2);
                            mp.prepare();
                            mp.start();

                        } catch (Exception e) {

                        }
                        //btn1.setImageBitmap();


                    }
                });
                return true;
            }
        });
        btn3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder options = new AlertDialog.Builder(SoundBoard.this);
                options.setMessage("Message");
                options.setPositiveButton("Set Icon",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                        //fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
                        temp = (ImageButton)findViewById(R.id.btn3);
                    }
                });
                options.setNegativeButton("Set Audio",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //setContentView(R.layout.fragment_recorder2);
                        RecorderFragment rf = RecorderFragment.newInstance();

                        FragmentManager fm = getFragmentManager();

                        FragmentTransaction fragmentTransaction = fm.beginTransaction();

                        rf.btn="3";

                        rf.num=3;

                        fragmentTransaction.add(R.id.soundBoard, rf);

                        fragmentTransaction.addToBackStack(null);
                        //fragmentTransaction.remove(rf);

                        fragmentTransaction.commit();




                    }
                });
                options.show();
                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = new MediaPlayer();
                        try {
                            mp.setDataSource(path3);
                            mp.prepare();
                            mp.start();

                        }
                        catch (Exception e){

                        }
                        //btn1.setImageBitmap();




                    }
                });
                return true;
            }
        });
        btn4.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder options = new AlertDialog.Builder(SoundBoard.this);
                options.setMessage("Message");
                options.setPositiveButton("Set Icon",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                        //fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
                        temp = (ImageButton)findViewById(R.id.btn4);
                    }
                });
                options.setNegativeButton("Set Audio",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //setContentView(R.layout.fragment_recorder2);
                        RecorderFragment rf = RecorderFragment.newInstance();

                        FragmentManager fm = getFragmentManager();

                        FragmentTransaction fragmentTransaction = fm.beginTransaction();
                        rf.btn="4";
                        rf.num=4;

                        fragmentTransaction.add(R.id.soundBoard, rf);

                        fragmentTransaction.addToBackStack(null);
                        //fragmentTransaction.remove(rf);

                        fragmentTransaction.commit();

//


                    }
                });
                options.show();
                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = new MediaPlayer();
                        try {
                            mp.setDataSource(path4);
                            mp.prepare();
                            mp.start();

                        }
                        catch (Exception e){

                        }
                        //btn1.setImageBitmap();




                    }
                });
                return true;
            }
        });

        btn5.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder options = new AlertDialog.Builder(SoundBoard.this);
                options.setMessage("Message");
                options.setPositiveButton("Set Icon",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                        //fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
                        temp = (ImageButton)findViewById(R.id.btn5);
                    }
                });
                options.setNegativeButton("Set Audio",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //setContentView(R.layout.fragment_recorder2);
                        RecorderFragment rf = RecorderFragment.newInstance();

                        FragmentManager fm = getFragmentManager();

                        FragmentTransaction fragmentTransaction = fm.beginTransaction();
                        rf.btn="5";
                        rf.num=5;

                        fragmentTransaction.add(R.id.soundBoard, rf);

                        fragmentTransaction.addToBackStack(null);
                        //fragmentTransaction.remove(rf);

                        fragmentTransaction.commit();




                    }
                });
                options.show();
                btn5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = new MediaPlayer();
                        try {
                            mp.setDataSource(path5);
                            mp.prepare();
                            mp.start();
                        }
                        catch (Exception e){

                        }
                        //btn1.setImageBitmap();




                    }
                });
                return true;
            }
        });
        btn6.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                AlertDialog.Builder options = new AlertDialog.Builder(SoundBoard.this);
                options.setMessage("Message");
                options.setPositiveButton("Set Icon",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent =  new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
//
                        //fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
                        intent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
                        startActivityForResult(intent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
                        temp = (ImageButton)findViewById(R.id.btn6);
                    }
                });
                options.setNegativeButton("Set Audio",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //setContentView(R.layout.fragment_recorder2);
                        RecorderFragment rf = RecorderFragment.newInstance();

                        FragmentManager fm = getFragmentManager();

                        FragmentTransaction fragmentTransaction = fm.beginTransaction();
                        rf.btn="6";
                        rf.num=6;

                        fragmentTransaction.add(R.id.soundBoard, rf);

                        fragmentTransaction.addToBackStack(null);
                        //fragmentTransaction.remove(rf);

                        fragmentTransaction.commit();




                    }
                });
                options.show();
                btn6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        MediaPlayer mp = new MediaPlayer();
                        try {
                            mp.setDataSource(path6);
                            mp.prepare();
                            mp.start();
                        }
                        catch (Exception e){

                        }
                        //btn1.setImageBitmap();




                    }
                });
                return true;
            }
        });

    }

    @Override
    public void onDataPass(String data,int num){



        int id = num;
        switch(id) {
            case 1:
                path1 = data;
                break;
            case 2:
                path2 = data;
                break;
            case 3:
                path3 = data;
                break;
            case 4:
                path4 = data;
                break;
            case 5:
                path5 = data;
                break;
            case 6:
                path6 = data;
                break;

        }

        //audioData = data;
    }



    @Override
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode != RESULT_CANCELED){
            if (requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE) {
                //Bitmap photo = (Bitmap) data.getExtras().get("data");
                Bitmap thumbnail = (Bitmap) data.getExtras().get("data");

                temp.setImageBitmap(thumbnail);
            }
        }

    }
    /*
    public static final int MEDIA_TYPE_IMAGE = 1;
    public static final int MEDIA_TYPE_VIDEO = 2;

    // Create a file Uri for saving an image or video
    private static Uri getOutputMediaFileUri(int type){
        return Uri.fromFile(getOutputMediaFile(type));
    }

    //Create a File for saving an image or video
    private static File getOutputMediaFile(int type){
        // To be safe, you should check that the SDCard is mounted
        // using Environment.getExternalStorageState() before doing this.

        File mediaStorageDir = new File(Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES), "MyCameraApp");
        // This location works best if you want the created images to be shared
        // between applications and persist after your app has been uninstalled.

        // Create the storage directory if it does not exist
        if (! mediaStorageDir.exists()){
            if (! mediaStorageDir.mkdirs()){
                Log.d("MyCameraApp", "failed to create directory");
                return null;
            }
        }

        // Create a media file name
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        File mediaFile;
        if (type == MEDIA_TYPE_IMAGE){
            mediaFile = new File(mediaStorageDir.getPath() + File.separator +
                    "IMG_"+ timeStamp + ".jpg");
        } else if(type == MEDIA_TYPE_VIDEO) {
            mediaFile = new File(mediaStorageDir.getPath() + File.separator +
                    "VID_"+ timeStamp + ".mp4");
        } else {
            return null;
        }

        return mediaFile;
    }*/

    @Override
    public void onBackPressed(){
        fm.popBackStack();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sound_board, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

             @Override
             public void onFragmentInteraction(Uri uri) {

             }
         }
