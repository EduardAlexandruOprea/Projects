using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Proiect

{
    public partial class Meniu : Form
    {
        public static int nr = 0;
        DataView dv;
        DataTable dt;
        public static int id;
        public static string aroma;
        public static string nume;
        public static int pret;
        public static int stoc;
        
        public static bool okAd;
        public void updateGrid()
        {
            Global.ds.Clear();
            Global.daLumanari = new System.Data.SqlClient.SqlDataAdapter("select * from Lumanari", Global.con);
            Global.daLumanari.Fill(Global.ds, "Lumanari");
            dataGridView1.DataSource = Global.ds;
            dataGridView1.DataMember = "Lumanari";
        }
        
        public Meniu()
        {

            if (Global.ok == 1)
            {
                Thread t = new Thread(new ThreadStart(StartForm));
                t.Start();
                Thread.Sleep(1300);
                InitializeComponent();
                t.Abort();
                Global.ok = 0;
            }
            else InitializeComponent();

        }

        private void Form1_Load(object sender, EventArgs e)
        {
           
            Global.con = new System.Data.SqlClient.SqlConnection(Global.stringConectare);
            Global.ds = new DataSet();
            comboBox1.Items.Add("Nume");
            comboBox1.Items.Add("Aroma");
            updateGrid();
            dt = Global.ds.Tables["Lumanari"];

            Global.cb = new SqlCommandBuilder(Global.daLumanari);

            Global.daLumanari.InsertCommand = Global.cb.GetInsertCommand();
            Global.daLumanari.DeleteCommand = Global.cb.GetDeleteCommand();
            Global.daLumanari.UpdateCommand = Global.cb.GetUpdateCommand();



        }
        public void StartForm()
        {
            Application.Run(new SplashScreen());
        }


        private void button5_Click(object sender, EventArgs e)
        {

            SqlCommand cmd = new SqlCommand();
            cmd.Connection = Global.con;
            cmd.CommandType = CommandType.StoredProcedure;
            cmd.CommandText = "ps_MediePret";
            SqlParameter p1 = new SqlParameter();
            p1.Value = textBox2.Text;
            p1.ParameterName = "@aroma";
            cmd.Parameters.Add(p1);
          
            
            Global.con.Open();
            label3.Text = cmd.ExecuteScalar().ToString();
            Global.con.Close();
        }

        private void button6_Click(object sender, EventArgs e)
        {
            
                Global.con.Open();

                SqlTransaction tr = Global.con.BeginTransaction();

                Global.daLumanari.InsertCommand.Transaction = tr;
                Global.daLumanari.UpdateCommand.Transaction = tr;
                Global.daLumanari.DeleteCommand.Transaction = tr;

                DataTable t = Global.ds.Tables["Lumanari"].GetChanges();

                try
                {
                    if (t != null)
                    {
                        Global.daLumanari.Update(t);
                        Global.ds.Tables["Lumanari"].AcceptChanges();
                        tr.Commit();
                    }

                }

                catch (Exception ex)
                {
                    MessageBox.Show("Salvare anulata\n" + ex);
                    tr.Rollback();
                }
                finally
                {
                    Global.con.Close();
                }

            

        }


        private void bAdaugare_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2();
            okAd = false; 
            f2.Show();
            this.Visible=false;
            
        }

      

        private void dataGridView1_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {
            
           
            

        }

        private void button2_Click(object sender, EventArgs e)
        {


            string insert = "  delete from Lumanari where id_lumanare = " + id ;
            Global.con.Open();
            SqlCommand cmd = new SqlCommand(insert, Global.con);
            cmd.ExecuteNonQuery();
            Global.con.Close();
            MessageBox.Show("Lumanarea ta a fost ștearsa cu succes!");
            updateGrid();

            }

        private void dataGridView1_RowHeaderMouseClick(object sender, DataGridViewCellMouseEventArgs e)
        {

            id = int.Parse(dataGridView1.Rows[e.RowIndex].Cells[0].Value.ToString());
            nume = dataGridView1.Rows[e.RowIndex].Cells[1].Value.ToString();
            aroma = dataGridView1.Rows[e.RowIndex].Cells[2].Value.ToString();
            pret= int.Parse(dataGridView1.Rows[e.RowIndex].Cells[3].Value.ToString());
            stoc= int.Parse(dataGridView1.Rows[e.RowIndex].Cells[4].Value.ToString());

        }

        private void button3_Click(object sender, EventArgs e)
        {
            Form2 f2 = new Form2();
            okAd = true;
            f2.Show();
            this.Visible = false;
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {
           
                string text1 = textBox1.Text;
            if (comboBox1.SelectedItem.ToString() == "Aroma")
            {
                
                dv = new DataView(dt, " aroma_lumanare= '" + textBox1.Text + "'", null, DataViewRowState.CurrentRows);
                dataGridView1.DataSource = dv;
            }
            else
            {
                if (comboBox1.SelectedItem.ToString() == "Nume")
                {
                    dv = new DataView(dt, " nume_lumanare= '" + textBox1.Text + "'", null, DataViewRowState.CurrentRows);
                    dataGridView1.DataSource = dv;
                }
            }
        }

        private void label1_Click(object sender, EventArgs e)
        {
            
        }

        private void button4_Click(object sender, EventArgs e)
        {
            Global.ds.Tables["Lumanari"].WriteXml(@"C:/Users/Administrator/Desktop/proiect/XML/Export.xml");

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label4_Click(object sender, EventArgs e)
        {

        }
    }
}
