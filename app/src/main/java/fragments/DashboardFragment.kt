package fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.bylaws.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class DashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener{
            val intent = Intent(context, ChapterIAct::class.java)
            startActivity(intent)
        }
        val button2 = view.findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent1 = Intent(context, ChapterIIAct::class.java)
            startActivity(intent1)
        }
        val button3 = view.findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent2 = Intent(context, ChapterIIIAct::class.java)
            startActivity(intent2)
        }
        val button4 = view.findViewById<Button>(R.id.button4)
        button4.setOnClickListener{
            val intent3 = Intent(context, ChapterIVAct::class.java)
            startActivity(intent3)
        }
        val button5 = view.findViewById<Button>(R.id.button5)
        button5.setOnClickListener{
            val intent4 = Intent(context, ChapterVAct::class.java)
            startActivity(intent4)
        }
        val signs = view.findViewById<Button>(R.id.signs)
        signs.setOnClickListener {
            val intent5 = Intent(context, RoadSigns::class.java)
            startActivity(intent5)
        }
        return view

        }

    }



