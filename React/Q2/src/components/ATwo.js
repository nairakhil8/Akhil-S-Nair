import React from 'react';
import ReactTable from "react-table";  

class EmpListTable extends React.Component{
    render(){
        const data= [{
            name:'Akhil',
            job:'CEO'},
        {
            name:'Hitman',
            job:'Project Manager'},
        {
            name:'ironman',
            job:'Director'},
        {
            name:'mrx',
            job:'Manager'},
        {
            name:'nightingale',
            job:'Project Manager'}]
        const columns = [
            {Header:'Name', accessor:'name'},
            {Header:'Job',accessor:'job'}
        
        ] 
        return (
            <div>
                <ReactTable
                data={data}
                columns = {columns} 
                />
            </div>
        )
    }
}
export default EmpListTable