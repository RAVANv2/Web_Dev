import {Card, CardBody} from "reactstrap";

function Header( {name} )
{
    return (
        <div>
            <Card className={"bg-warning"}>
                <CardBody>
                    <h1 className={"text-center"}> Welcome to Courses Application </h1>
                </CardBody>
            </Card>
        </div>
    );
}

export default Header;